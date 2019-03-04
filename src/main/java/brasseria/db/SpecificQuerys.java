package brasseria.db;

import brasseria.config.Configuration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SpecificQuerys extends DB {

    private final static Logger logger = Logger.getLogger(SpecificQuerys.class);
    private static SpecificQuerys instance;

    private SpecificQuerys(String host, String inst, String port, String db, String usuario, String password) throws Exception {
        super(host, inst, port, db, usuario, password);
    }

    public static SpecificQuerys getInstance() {
        if (instance == null) {
            try {
                Configuration c = Configuration.getInstance();
                instance = new SpecificQuerys(
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

    public ArrayList<Object[]> getProductsAndCount() throws Exception {
        ArrayList<Object[]> list = new ArrayList();

        String query = "SELECT "
                + " p.name,"
                + " m.total "
                + "FROM"
                + " Product p "
                + "INNER JOIN "
                + "        ("
                + "            SELECT  product_id, MAX(createAt) MaxDate"
                + "            FROM    Movements"
                + "            GROUP BY product_id"
                + "        ) MaxDates "
                + "ON "
                + " p.id = MaxDates.product_id "
                + "INNER JOIN "
                + " Movements m "
                + "ON "
                + " MaxDates.product_id = m.product_id "
                + "AND "
                + " MaxDates.MaxDate = m.createAt";

        try (Connection conSer = getConnection(); PreparedStatement stmSer = conSer.prepareStatement(query)) {
            try (ResultSet rsSer = stmSer.executeQuery()) {
                while (rsSer.next()) {
                    Object[] obj = new Object[]{rsSer.getString("name"), rsSer.getString("total")};
                    list.add(obj);
                }
            }
        }

        return list;
    }

    public Object[] getProductsAndCountByName(String name) throws Exception {
        Object[] obj = null;

        String query = "SELECT "
                + " p.name,"
                + " m.total "
                + "FROM"
                + " Product p "
                + "INNER JOIN "
                + "        ("
                + "            SELECT  product_id, MAX(createAt) MaxDate"
                + "            FROM    Movements"
                + "            GROUP BY product_id"
                + "        ) MaxDates "
                + "ON "
                + " p.id = MaxDates.product_id "
                + "INNER JOIN "
                + " Movements m "
                + "ON "
                + " MaxDates.product_id = m.product_id "
                + "AND "
                + " MaxDates.MaxDate = m.createAt "
                + "WHERE p.name = ?";

        try (Connection conSer = getConnection(); PreparedStatement stmSer = conSer.prepareStatement(query)) {
            stmSer.setString(1, name);
            try (ResultSet rsSer = stmSer.executeQuery()) {
                while (rsSer.next()) {
                    obj = new Object[]{rsSer.getString("name"), 0, 0, rsSer.getString("total")};
                }
            }
        }

        return obj;
    }
}
