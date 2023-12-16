
package modelo;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import util.*;

public class Mesero {
    private String id;
    private String nombre;
    private String fecha;
    Connection cn;

    public String getId() {
        return id;}
    public void setId(String id) {
        this.id = id;}
    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}
    public String getFecha() {
        return fecha;}
    public void setFecha(String fecha) {
        this.fecha = fecha; }
    
    public Mesero(){
        SQLConexion con=new SQLConexion();
        cn= con.getConexion();
    }
    
    public void LLenarDatosMese(DefaultTableModel modelo){
        try {
            String sql="select * from Mesero";
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs= cmd.executeQuery();
          
            while(rs.next()){
                // aqui esta el arreglo de objetos guey
                Object[] datos=new Object[3];
              
                for(int i=0;i<3;i++){
                    datos[i]=rs.getString(i+1);                  
                }
                modelo.addRow(datos);
            }
            cmd.close();
            cn.close();
           
        } catch (Exception e) { System.out.println(e.getMessage());
        }
    } 
    
    public void AgregarMese (String nombre){
        try {
            String sql="execute PR_ADI_MESE ?";
            PreparedStatement cmd=cn.prepareCall(sql);
            cmd.setString(1, nombre);
            cmd.execute();                     
            cmd.close();
            cn.close();          
        } catch (Exception e) {                                                                                                                                                                                                                        
            System.out.println(e.getMessage());
        }      
    }
}
