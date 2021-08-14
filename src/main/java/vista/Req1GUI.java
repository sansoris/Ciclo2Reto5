package vista;

import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_1Vo;
import java.util.ArrayList;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class Req1GUI extends JFrame {
//    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
   private JTable tablaRequerimiento1;

   public Req1GUI (ArrayList<Requerimiento_1Vo> resultado_requerimiento1,  ControladorRequerimientos controlador){
    setTitle("Resultados de consulta: ");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    String[] encabezadosTabla = {"Ciudad", "Promedio"};
    tablaRequerimiento1 = new JTable(this.formatoPromedios(resultado_requerimiento1, encabezadosTabla.length),encabezadosTabla);


    JScrollPane sp = new JScrollPane(tablaRequerimiento1);
    JPanel panel = new JPanel();
    panel.add(sp);
    panel.setBorder(new TitledBorder("Salario de lideres menor a 400.000 por ciudad"));
    getContentPane().add(panel);

    setSize(500,600);
    setLocationRelativeTo(null);
    setVisible(true);

   }

    public String[][] formatoPromedios(ArrayList<Requerimiento_1Vo> resultado_requerimiento1, int numeroColumnas ){
        String[][] registros = new String [resultado_requerimiento1.size()][numeroColumnas];
        for (int i = 0; i < registros.length; i++) {
            registros[i][0]= resultado_requerimiento1.get(i).getCiudadResidencia();
            registros[i][1]= String.valueOf(resultado_requerimiento1.get(i).getPromedioSalario());
        }
        return registros;
    }
} 
   
    
    