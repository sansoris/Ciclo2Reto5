package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_3Vo;
import util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3Vo> requerimiento3() throws SQLException {
        Connection connection3 = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_3Vo> listado_registros_rq3 = new ArrayList<Requerimiento_3Vo>();
        String sql = "SELECT p.ID_Proyecto, mc.Nombre_Material from Proyecto p, MaterialConstruccion mc natural JOIN Compra c WHERE p.ID_Proyecto >=40 and p.ID_Proyecto <=55 ORDER BY p.ID_Proyecto;";
        try (Statement stmt = connection3.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_3Vo requerimiento3 = new Requerimiento_3Vo();
                requerimiento3.setProyectoID(rs.getString("ID_Proyecto"));
                requerimiento3.setNombreMaterial(rs.getString("Nombre_Material"));
                listado_registros_rq3.add(requerimiento3);
            }
        }
        return listado_registros_rq3;
    }
}
