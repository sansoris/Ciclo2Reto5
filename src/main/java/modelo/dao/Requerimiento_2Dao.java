package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {
        Connection connection2 = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_2Vo> listado_registros_rq2 = new ArrayList<Requerimiento_2Vo>();
        String sql = "SELECT p.ID_Proyecto,  c.Proveedor FROM Proyecto p, Compra c natural JOIN Compra c WHERE p.Ciudad =='Neiva' ORDER BY p.ID_Proyecto;";
        try (Statement stmt = connection2.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_2Vo requerimiento2 = new Requerimiento_2Vo();
                requerimiento2.setProyectoID(rs.getString("ID_Proyecto"));
                requerimiento2.setProveedorCompra(rs.getString("Proveedor"));
                listado_registros_rq2.add(requerimiento2);
            }
        }
        return listado_registros_rq2;
    }
    }
