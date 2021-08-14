package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


import controlador.ControladorRequerimientos;

// Convertir en ventana especializada en los requerimientos 
// desde la herencia de JFrame

public class MenuReqGUI extends JFrame {
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    private JButton bRequerimiento1, bRequerimiento2, bRequerimiento3;
    private JLabel labelTitulo;
    private JTextArea areaIntroduccion;
    
    
    // Metodo que genera la ventana
    // Menú de inicio de la interfaz

    public void inicioGUI(){
    //Título -
    setTitle("MISIÓN TIC 2022");
  	setDefaultCloseOperation(EXIT_ON_CLOSE);
    

    labelTitulo = new JLabel("                    EJERCICIO INTERFAZ GRÁFICA DE USUARIO *GUI*");
    // labelTitulo.setBounds(0, 0, 0, 0);
    labelTitulo.setFont(new java.awt.Font("Verdana", 1, 12));	
   
    areaIntroduccion = new JTextArea("            Reto 5 Grupo 65");
    areaIntroduccion.setBounds(130, 50, 150, 15);
    areaIntroduccion.setFont(new java.awt.Font("Verdana", 0, 10));
    areaIntroduccion.setForeground(Color.RED);



    // add(labelTitulo);
    add(areaIntroduccion);

    //Crear los componentes (instancias)
    ImageIcon icono = new ImageIcon("imagen\\lideres.png");
    Image img = icono.getImage();
    icono = new ImageIcon (img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    bRequerimiento1 = new JButton(icono);
    bRequerimiento1.setText("REQUERIMIENTO 1  Salario de Lideres Menor a 400.000 por ciudad");
    bRequerimiento1.setFont(new Font("Dialog", Font.PLAIN, 12));
    bRequerimiento1.addActionListener(controlador); // quien me escucha 
    bRequerimiento1.setActionCommand("Requerimiento1");

    ImageIcon icono2 = new ImageIcon("imagen\\construccion.png");
    Image img2 = icono2.getImage();
    icono2 = new ImageIcon (img2.getScaledInstance(100, 50, java.awt.Image.SCALE_SMOOTH));
    bRequerimiento2 = new JButton(icono2);
    bRequerimiento2.setText("REQUERIMIENTO 2   Proveedores Proyecto Neiva");
    bRequerimiento2.setFont(new Font("Dialog", Font.PLAIN, 12));
    bRequerimiento2.addActionListener(controlador); // quien me escucha 
    bRequerimiento2.setActionCommand("Requerimiento2");

    ImageIcon icono3 = new ImageIcon("imagen\\materiales.png");
    Image img3 = icono3.getImage();
    icono3 = new ImageIcon (img3.getScaledInstance(80, 50, java.awt.Image.SCALE_SMOOTH));
    bRequerimiento3 = new JButton(icono3);
    bRequerimiento3.setText("REQUERIMIENTO 3\n  Materiales Proyectos Cod40 a Cod55");
    bRequerimiento3.setFont(new Font("Dialog", Font.PLAIN, 12));
    bRequerimiento3.addActionListener(controlador); // quien me escucha 
    bRequerimiento3.setActionCommand("Requerimiento3");
    
    // Añadir los componentes a un panel intermedio
    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridLayout(4,1));
    panel1.add(labelTitulo);
    // panel1.add(areaIntroduccion);
    panel1.add(bRequerimiento1);
    panel1.add(bRequerimiento2);
    panel1.add(bRequerimiento3);

    // Añadir el panel a la ventana
    getContentPane().add(panel1);
   
    //Establecer propiedades
    setSize(500,350);
    setLocationRelativeTo(null); 
    setVisible(true);

    }

  



    // public static void requerimiento1() {
    //     try {
    //         ArrayList<Requerimiento_1Vo> resultado_requerimiento1 = controlador.consultarRequerimiento1();
    //         resultado_requerimiento1.forEach(System.out::println);
    //     } catch (Exception e) {
    //         System.out.println("Se ha producido el siguiente error:" + e.getMessage());
    //         e.printStackTrace();
    //     }
    // }

    // public static void requerimiento2() {
    //     try {
    //         ArrayList<Requerimiento_2Vo> resultado_requerimiento2 = controlador.consultarRequerimiento2();
    //         resultado_requerimiento2.forEach(System.out::println);
    //     } catch (Exception e) {
    //         System.out.println("Se ha producido el siguiente error:" + e.getMessage());
    //         e.printStackTrace();
    //     }
    // }

    // public static void requerimiento3() {
    //     try {
    //        ArrayList<Requerimiento_3Vo> resultado_requerimiento3 = controlador.consultarRequerimiento3();
    //        resultado_requerimiento3.forEach(System.out::println);
    //     } catch (Exception e) {
    //         System.out.println("Se ha producido el siguiente error:" + e.getMessage());
    //         e.printStackTrace();
    //     }
    // }
}
