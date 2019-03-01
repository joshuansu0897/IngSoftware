/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

import brasseria.config.Configuration;
import brasseria.model.User;
import brasseria.util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class UserDB extends DB {

    private final static Logger logger = Logger.getLogger(UserDB.class);
    private static UserDB instance;

    private UserDB(String host, String inst, String port, String db, String usuario, String password) throws Exception {
        super(host, inst, port, db, usuario, password);
    }

    public static UserDB getInstance() {
        if (instance == null) {
            try {
                Configuration c = Configuration.getInstance();
                instance = new UserDB(
                        c.getConfiguracion("Server"),
                        c.getConfiguracion("DataBase"),
                        c.getConfiguracion("Port"),
                        c.getConfiguracion("NameDataBase"),
                        c.getConfiguracion("User"),
                        c.getConfiguracion("Password")
                );
            } catch (Exception e) {
                logger.error("Error al conectar con base de datos.", e);
            }
        }
        return instance;
    }

    public boolean autenticacion(String usuario, String contraseña) throws Exception {
        if (usuario == null || usuario.equals("")) {
            return false;
        }

        String query = "SELECT password "
                + "	FROM User WHERE username=?";

        String password = null;
        try (Connection conS = getConnection(); PreparedStatement stmS = conS.prepareStatement(query)) {
            stmS.setString(1, usuario);
            ResultSet rs = stmS.executeQuery();
            while (rs.next()) {
                password = rs.getString("password");
            }
        }

        String sha = Util.encrypt(contraseña);
        return sha.equals(password);
    }

    public boolean userExist(String uss) throws Exception {

        String password = null;
        String username = null;

        String query = "SELECT username, password\n"
                + "	FROM User WHERE username = ?";

        try (Connection conS = getConnection(); PreparedStatement stmS = conS.prepareStatement(query)) {
            stmS.setString(1, uss);
            ResultSet rs = stmS.executeQuery();
            while (rs.next()) {
                password = rs.getString("password");
                username = rs.getString("username");
            }
        }
        return (password != null && username != null);
    }

    public boolean saveUser(User user) throws Exception {
        boolean nueva = user.getId() == -1;

        if (userExist(user.getUsername()) && nueva) {
            JOptionPane.showMessageDialog(null, "username was already taken");
            return false;
        }

        String query;
        try (Connection con = getConnection()) {
            PreparedStatement stm;

            if (nueva) {
                query = "INSERT INTO User("
                        + "	name, username, password) "
                        + "	VALUES (?, ?, ?);";
                stm = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            } else {
                query = "UPDATE User"
                        + "	SET name=?, username=?, password=?"
                        + "	WHERE id=?";
                stm = con.prepareStatement(query);
                stm.setLong(4, user.getId());
            }

            stm.setString(1, user.getName());
            stm.setString(2, user.getUsername());
            stm.setString(3, user.getPassword());

            stm.executeUpdate();
            stm.close();
        }
        return true;
    }

    public ArrayList<User> getAllUsers() throws Exception {
        ArrayList<User> users = new ArrayList();

        String query = "SELECT id, name, username, password, createAt, updateAt\n"
                + "	FROM User";

        try (Connection conSer = getConnection(); PreparedStatement stmSer = conSer.prepareStatement(query)) {
            try (ResultSet rsSer = stmSer.executeQuery()) {
                while (rsSer.next()) {
                    User U = new User();
                    U.setId(rsSer.getLong("id"));
                    U.setName(rsSer.getString("name"));
                    U.setUsername(rsSer.getString("username"));
                    U.setPassword(rsSer.getString("password"));
                    U.setCreateAt(rsSer.getObject("createAt", LocalDate.class));
                    U.setCreateAt(rsSer.getObject("updateAt", LocalDate.class));
                    users.add(U);
                }
            }
        }
        return users;
    }

    public User getUserByUsername(String str) throws Exception {
        User user = null;

        String query = "SELECT id, name, username, password, createAt, updateAt\n"
                + "	FROM User WHERE username=?";

        try (Connection conSer = getConnection(); PreparedStatement stmSer = conSer.prepareStatement(query)) {
            stmSer.setString(1, str);
            try (ResultSet rsSer = stmSer.executeQuery()) {
                while (rsSer.next()) {
                    user = new User();
                    user.setId(rsSer.getLong("id"));
                    user.setName(rsSer.getString("name"));
                    user.setUsername(rsSer.getString("username"));
                    user.setPassword(rsSer.getString("password"));
                    user.setCreateAt(rsSer.getObject("createAt", LocalDate.class));
                    user.setCreateAt(rsSer.getObject("updateAt", LocalDate.class));
                }
            }
        }
        return user;
    }

    public void deleteUser(Long id) throws Exception {
        String query = "DELETE FROM User"
                + "	WHERE id = ?";
        try (Connection conSer = getConnection(); PreparedStatement stmSer = conSer.prepareStatement(query)) {
            stmSer.setLong(1, id);
            stmSer.executeUpdate();
        }
    }
}
