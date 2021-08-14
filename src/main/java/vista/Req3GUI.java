package vista;

import java.util.ArrayList;

import javax.swing.JFrame;
//import java.awt.font.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import controlador.ControladorRequerimientos;
// import modelo.vo.Requerimiento_1Vo;
// import modelo.vo.Requerimiento_2Vo;
import modelo.vo.Requerimiento_3Vo;

public class Req3GUI extends JFrame {
//    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
   private JTable tablaRequerimiento3;

   public Req3GUI (ArrayList<Requerimiento_3Vo> resultado_requerimiento3,  ControladorRequerimientos controlador){
    setTitle("Resultados de consulta: ");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    String[] encabezadosTabla = {"Codigo", "Materiales"};
    tablaRequerimiento3 = new JTable(this.formatoPromedios(resultado_requerimiento3, encabezadosTabla.length),encabezadosTabla);

    JScrollPane sp = new JScrollPane(tablaRequerimiento3);
    JPanel panel = new JPanel();
    panel.add(sp);
    panel.setBorder(new TitledBorder("Materiales Proyectos Cod40 a Cod55"));
    getContentPane().add(panel);

    setSize(500,600);
    setLocationRelativeTo(null);
    setVisible(true);

   }

    public String[][] formatoPromedios(ArrayList<Requerimiento_3Vo> resultado_requerimiento3, int numeroColumnas ){
        String[][] registros = new String [resultado_requerimiento3.size()][numeroColumnas];
        for (int i = 0; i < registros.length; i++) {
            registros[i][0]= resultado_requerimiento3.get(i).getProyectoID();
            registros[i][1]= String.valueOf(resultado_requerimiento3.get(i).getNombreMaterial());
        }
        return registros;
    }
} 
   
    
    