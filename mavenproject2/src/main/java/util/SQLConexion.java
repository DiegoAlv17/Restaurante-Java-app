package util;
import java.sql.*;
public class SQLConexion
 { 
public static Connection getConexion(){ 
Connection con = null;
 try { Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
String url ="jdbc:sqlserver://localhost:1433;database=RESTAURANTE"; 
String usr = "sa"; 
String psw = "123"; 
con = DriverManager.getConnection(url,usr,psw);
     System.out.println("Conexion correcta"); } 
catch (ClassNotFoundException ex) { System.out.println("No hay Driver!!"); } 
catch (SQLException ex) 
{ System.out.println("Error con la BD"); }
 return con; }
 } 