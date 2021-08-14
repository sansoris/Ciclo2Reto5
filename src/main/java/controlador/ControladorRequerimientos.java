package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;

import modelo.dao.Requerimiento_1Dao;
import modelo.vo.Requerimiento_1Vo;

import modelo.dao.Requerimiento_2Dao;
import modelo.vo.Requerimiento_2Vo;

import modelo.dao.Requerimiento_3Dao;
import modelo.vo.Requerimiento_3Vo;

import vista.MenuReqGUI;
import vista.Req1GUI;
import vista.Req2GUI;
import vista.Req3GUI;

import vista.VistaRequerimientos;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ControladorRequerimientos implements ActionListener  {
    
    private Requerimiento_1Dao requerimiento_1Dao;
    private Requerimiento_2Dao requerimiento_2Dao;
    private Requerimiento_3Dao requerimiento_3Dao;

    private MenuReqGUI menuReqGUI;
    private Req1GUI req1gui;
    private Req2GUI req2gui;
    private Req3GUI req3gui;


    public ControladorRequerimientos() {
        this.requerimiento_1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.requerimiento_3Dao = new Requerimiento_3Dao();
        this.menuReqGUI = new MenuReqGUI();
    }

    public ArrayList<Requerimiento_1Vo> consultarRequerimiento1() throws SQLException {
        return this.requerimiento_1Dao.requerimiento1();
    }

    
    public ArrayList<Requerimiento_2Vo> consultarRequerimiento2() throws SQLException {
       return this.requerimiento_2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento_3Vo> consultarRequerimiento3() throws SQLException {
     return this.requerimiento_3Dao.requerimiento3();
    }

    public void inicio(){
    this.menuReqGUI.inicioGUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        String actionCommand =  ((JButton)e.getSource()).getActionCommand();
        switch (actionCommand) {
            case "Requerimiento1":
                // System.out.println("Requerimiento 1 en construcción");
                // ArrayList<Requerimiento_1Vo> resultado_requerimiento1 = new ArrayList<Requerimiento_1Vo>();
                try{
                // VistaRequerimientos.requerimiento1b(this.consultarRequerimiento1());
                this.req1gui = new Req1GUI(this.consultarRequerimiento1(), this);
                
                }catch(SQLException exception){
                    System.err.println("Por favor vuelva a consultar"+ exception);
                }
            break;
            case "Requerimiento2":
                // System.out.println("Requerimiento 2 en construcción");
                try{
                    // VistaRequerimientos.requerimiento2b(this.consultarRequerimiento2());
                    this.req2gui = new Req2GUI(this.consultarRequerimiento2(), this);
                    
                    }catch(SQLException exception2){
                        System.err.println("Por favor vuelva a consultar"+ exception2);
                    }

            break;
            case "Requerimiento3":
                // System.out.println("Requerimiento 3 en construcción");
                try{
                    // VistaRequerimientos.requerimiento3b(this.consultarRequerimiento3());
                    this.req3gui = new Req3GUI(this.consultarRequerimiento3(), this);
                    
                    }catch(SQLException exception3){
                        System.err.println("Por favor vuelva a consultar"+ exception3);
                    }
            break;
            
        }
    }
}
