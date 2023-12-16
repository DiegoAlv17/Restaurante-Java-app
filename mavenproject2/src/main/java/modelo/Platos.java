
package modelo;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import util.*;

public class Platos {
    Connection cn;
    private String id;
    private String nombre;
    private String precio;
    private String disponibilidad;

    public String getId() {return id;}
    public void setId(String id) { this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getPrecio() { return precio;}
    public void setPrecio(String precio) {this.precio = precio;}
    public String getDisponibilidad() {return disponibilidad;}
    public void setDisponibilidad(String disponibilidad) {this.disponibilidad = disponibilidad;}
    
    
    public Platos(){
        SQLConexion con=new SQLConexion();
        cn= con.getConexion();
    }
    
    public void LLenarDatos(DefaultTableModel modelo){
        try {
            String sql="select * from Platos";
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs= cmd.executeQuery();
           
            while(rs.next()){
                // aqui esta el arreglo de objetos guey
                Object[] datos=new Object[4];
              
                for(int i=0;i<4;i++){
                    datos[i]=rs.getString(i+1);                  
                }
                modelo.addRow(datos);
            }
            cmd.close();
            cn.close();
           
        } catch (Exception e) { System.out.println(e.getMessage());
        }
    }  
    
    public void Agregar1 (String nombre, double precio, String disponibilidad){
        try {
            String sql="execute PR_ADI_PLA ?,?,?";
            PreparedStatement cmd=cn.prepareCall(sql);
            cmd.setString(1, nombre);
            cmd.setDouble(2, precio);
            cmd.setString(3, disponibilidad);
            cmd.execute();                     
            cmd.close();
            cn.close();          
        } catch (Exception e) {                                                                                                                                                                                                                        
            System.out.println(e.getMessage());
        }      
    } 
    
    public void BuscarDatosPla(DefaultTableModel modelo, String buscarp) {
        try {
            String sql = "SELECT * FROM PLATOS WHERE id_plato LIKE '%"+buscarp+"%' OR nom_plato LIKE '%"+buscarp+
                    "%'OR precio LIKE '%"+buscarp+"%' OR dispon LIKE '%"+buscarp+"%'";
            CallableStatement cmd = cn.prepareCall(sql);
            ResultSet rs = cmd.executeQuery();

            while (rs.next()) {
                // aqui esta el arreglo de objetos guey
                Object[] datos = new Object[4];

                for (int i = 0; i < 4; i++) {
                    datos[i] = rs.getString(i + 1);
                }
                modelo.addRow(datos);
            }
            cmd.close();
            cn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
