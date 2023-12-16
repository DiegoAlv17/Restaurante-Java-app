/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import util.SQLConexion;

/**
 *
 * @author ACER
 */
public class Negocio {

    Connection cn;

    public List<Mesa> lisMesa() {
        Connection cn = SQLConexion.getConexion();
        List<Mesa> lista = new ArrayList();
        try {
            String sql = "SELECT Id_mesa from MESA";
            CallableStatement st = cn.prepareCall(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Mesa m = new Mesa();
                m.setId(rs.getString(1));
                lista.add(m);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    public List<Mesero> lisMese() {
        Connection cn = SQLConexion.getConexion();
        List<Mesero> lista = new ArrayList();
        try {
            String sql = "SELECT nom_mesero from MESERO";
            CallableStatement st = cn.prepareCall(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Mesero e = new Mesero();
                e.setNombre(rs.getString(1));
                lista.add(e);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lista;
    }

     public List<FacDeta> ListDataFacDeta(String cod){
      Connection cn= SQLConexion.getConexion();
      List<FacDeta> lista=new ArrayList();
      try{
        String sql="{call PR_LISTFD ('"+cod+"')}";
        CallableStatement st=cn.prepareCall(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            FacDeta c=new FacDeta();
            c.setIdp(rs.getString(1));
            c.setNp(rs.getString(2));
            c.setCt(Integer.parseInt(rs.getString(3)));
            c.setPrec(Double.parseDouble(rs.getString(4)));
            c.setTp(rs.getString(5));
            lista.add(c);
        }
          
      }catch(Exception ex){
          ex.printStackTrace();
      }
        
       return lista; 
    }
     
    public List<ReportePlatos> ListDataReporteP(){
      Connection cn= SQLConexion.getConexion();
      List<ReportePlatos> lista=new ArrayList();
      try{
        String sql="{call PR_PLATOSV}";
        CallableStatement st=cn.prepareCall(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            ReportePlatos c=new ReportePlatos();
            c.setNompla(rs.getString(1));
            c.setCantpla(rs.getInt(2));
            lista.add(c);
        }
          
      }catch(Exception ex){
          ex.printStackTrace();
      }
        
       return lista; 
    }
    
    public List<ReporteMeseros> ListDataReporteM(){
      Connection cn= SQLConexion.getConexion();
      List<ReporteMeseros> lista=new ArrayList();
      try{
        String sql="{call PR_VENGAN}";
        CallableStatement st=cn.prepareCall(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            ReporteMeseros c=new ReporteMeseros();
            c.setNommese(rs.getString(1));
            c.setGanan(rs.getDouble(2));
            lista.add(c);
        }
          
      }catch(Exception ex){
          ex.printStackTrace();
      }
        
       return lista; 
    }
    
    public List<ReporteClientes> ListDataReporteC(String cod){
      Connection cn= SQLConexion.getConexion();
      List<ReporteClientes> lista=new ArrayList();
      try{
        String sql="{call PR_CLIPED ('"+cod+"')}";
        CallableStatement st=cn.prepareCall(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            ReporteClientes c=new ReporteClientes();
            c.setIdboleta(rs.getString(1));
            c.setNompla(rs.getString(2));
            c.setCantpla(rs.getString(3));
            c.setTipopago(rs.getString(4));
            lista.add(c);
        }
          
      }catch(Exception ex){
          ex.printStackTrace();
      }
        
       return lista; 
    }
}    