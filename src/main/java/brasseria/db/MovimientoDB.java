package brasseria.db;

import brasseria.config.Configuration;
import brasseria.model.Movimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class MovimientoDB extends DB {

    private final static Logger logger = Logger.getLogger(MovimientoDB.class);
    private static MovimientoDB instance;

    private MovimientoDB(String host, String inst, String port, String db, String usuario, String password) throws Exception {
        super(host, inst, port, db, usuario, password);
    }

    public static MovimientoDB getInstance() {
        if (instance == null) {
            try {
                Configuration c = Configuration.getInstance();
                instance = new MovimientoDB(
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

    public void saveMovimiento(Movimiento movimiento) throws Exception {
        try (Connection con = getConnection()) {
            String query = "INSERT INTO Movements(product_id, added_amount, retired_amount, total) VALUES (?, ?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(query);

            stm.setLong(1, movimiento.getProduct_id());
            stm.setLong(2, movimiento.getAdded_amount());
            stm.setLong(3, movimiento.getRetired_amount());
            stm.setLong(4, movimiento.getTotal());

            stm.executeUpdate();
            stm.close();
        }
    }

    public void saveTablaMovimientos(ArrayList<Movimiento> movimientos) throws Exception {
        if (movimientos != null && !movimientos.isEmpty()) {
            try (Connection con = getConnection()) {
                String query = "INSERT INTO Movements(product_id, added_amount, retired_amount, total) VALUES (?, ?, ?, ?)";
                PreparedStatement stm = con.prepareStatement(query);
                for (Movimiento movimiento : movimientos) {
                    stm.setLong(1, movimiento.getProduct_id());
                    stm.setLong(2, movimiento.getAdded_amount());
                    stm.setLong(3, movimiento.getRetired_amount());
                    stm.setLong(4, movimiento.getTotal());
                    stm.addBatch();
                }
                stm.executeBatch();
            }
        }
    }
}
