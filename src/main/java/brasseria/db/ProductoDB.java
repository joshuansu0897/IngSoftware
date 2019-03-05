package brasseria.db;

import brasseria.config.Configuration;
import brasseria.model.Movimiento;
import brasseria.model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class ProductoDB extends DB {

    private final static Logger logger = Logger.getLogger(ProductoDB.class);
    private static ProductoDB instance;

    private ProductoDB(String host, String inst, String port, String db, String usuario, String password) throws Exception {
        super(host, inst, port, db, usuario, password);
    }

    public static ProductoDB getInstance() {
        if (instance == null) {
            try {
                Configuration c = Configuration.getInstance();
                instance = new ProductoDB(
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

    public boolean productoExist(String name) throws Exception {

        String resName = null;
        String description = null;

        String query = "SELECT name, description "
                + "	FROM Product WHERE name = ?";

        try (Connection conS = getConnection(); PreparedStatement stmS = conS.prepareStatement(query)) {
            stmS.setString(1, name);
            try (ResultSet rs = stmS.executeQuery()) {
                while (rs.next()) {
                    description = rs.getString("description");
                    resName = rs.getString("name");
                }
            }
        }
        return (description != null && resName != null);
    }

    public boolean saveProducto(Producto producto) throws Exception {
        boolean nueva = producto.getId() == -1;

        if (productoExist(producto.getName()) && nueva) {
            JOptionPane.showMessageDialog(null, "ya tienes un producto con ese nombre");
            return false;
        }

        String query;
        try (Connection con = getConnection()) {
            PreparedStatement stm;

            if (nueva) {
                query = "INSERT INTO Product("
                        + "	name, description, perecederos, proveedor_id) "
                        + "	VALUES (?, ?, ?, ?);";
                stm = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            } else {
                query = "UPDATE Product"
                        + "	SET name=?, description=?, perecederos=?, proveedor_id=?"
                        + "	WHERE id=?";
                stm = con.prepareStatement(query);
                stm.setLong(5, producto.getId());
            }

            stm.setString(1, producto.getName());
            stm.setString(2, producto.getDescription());
            stm.setBoolean(3, producto.isPerecederos());
            stm.setLong(4, producto.getIdProveedor());

            stm.executeUpdate();

            if (nueva) {
                try (ResultSet rs = stm.getGeneratedKeys()) {
                    while (rs.next()) {
                        long id = rs.getInt(1);

                        Movimiento movimiento = new Movimiento();
                        movimiento.setAdded_amount(0);
                        movimiento.setRetired_amount(0);
                        movimiento.setTotal(0);
                        movimiento.setProduct_id(id);
                        producto.setId(id);

                        MovimientoDB.getInstance().saveMovimiento(movimiento);
                    }
                }
            }

            stm.close();
        }
        return true;
    }

    public ArrayList<Producto> getAllProductos() throws Exception {
        ArrayList<Producto> productos = new ArrayList();

        String query = "SELECT id, name, perecederos, proveedor_id, description, createAt, updateAt "
                + "	FROM Product";

        try (Connection conSer = getConnection(); PreparedStatement stmSer = conSer.prepareStatement(query)) {
            try (ResultSet rsSer = stmSer.executeQuery()) {
                while (rsSer.next()) {
                    Producto producto = new Producto();
                    producto.setId(rsSer.getLong("id"));
                    producto.setName(rsSer.getString("name"));
                    producto.setPerecederos(rsSer.getBoolean("perecederos"));
                    producto.setIdProveedor(rsSer.getLong("proveedor_id"));
                    producto.setDescription(rsSer.getString("description"));
                    producto.setCreateAt(rsSer.getObject("createAt", LocalDate.class));
                    producto.setUpdateAt(rsSer.getObject("updateAt", LocalDate.class));
                    productos.add(producto);
                }
            }
        }
        return productos;
    }

    public Producto getProductoByName(String str) throws Exception {
        Producto producto = null;

        String query = "SELECT id, perecederos, proveedor_id, description, createAt, updateAt "
                + "	FROM Product WHERE name=?";

        try (Connection conSer = getConnection(); PreparedStatement stmSer = conSer.prepareStatement(query)) {
            stmSer.setString(1, str);
            try (ResultSet rsSer = stmSer.executeQuery()) {
                while (rsSer.next()) {
                    producto = new Producto();
                    producto.setId(rsSer.getLong("id"));
                    producto.setName(str);
                    producto.setPerecederos(rsSer.getBoolean("perecederos"));
                    producto.setIdProveedor(rsSer.getLong("proveedor_id"));
                    producto.setDescription(rsSer.getString("description"));
                    producto.setCreateAt(rsSer.getObject("createAt", LocalDate.class));
                    producto.setUpdateAt(rsSer.getObject("updateAt", LocalDate.class));
                }
            }
        }
        return producto;
    }

    public void deleteProducto(Long id) throws Exception {
        String query = "DELETE FROM Product"
                + "	WHERE id = ?";
        try (Connection conSer = getConnection(); PreparedStatement stmSer = conSer.prepareStatement(query)) {
            stmSer.setLong(1, id);
            stmSer.executeUpdate();
        }
    }

}
