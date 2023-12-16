
package modelo;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import util.*;

public class Mesa {
    Connection cn; 
    private String id;
    private String comensales;
    private String ubicacion;

    public String getId() {
        return id;}
    public void setId(String id) {
        this.id = id;}
    public String getComensales() {
        return comensales;}
    public void setComensales(String comensales) {
        this.comensales = comensales;}
    public String getUbicacion() {
        return ubicacion;}
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;}
    
    public Mesa(){
        SQLConexion con=new SQLConexion();
        cn= con.getConexion();
    }
    
    public void LLenarDatosMesa(DefaultTableModel modelo){
        try {
            String sql="select * from Mesa";
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
    
    public void AgregarMesa (int comensales, String ubicacion){
        try {
            String sql="execute PR_ADI_MESA ?,?";
            PreparedStatement cmd=cn.prepareCall(sql);
            cmd.setInt(1, comensales);
            cmd.setString(2, ubicacion);
            cmd.execute();                     
            cmd.close();
            cn.close();          
        } catch (Exception e) {                                                                                                                                                                                                                        
            System.out.println(e.getMessage());
        }      
    }
}
