/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import util.*;

public class Cliente {

    Connection cn;

    private String codigo;
    private String nombre;
    private String apellido;
    private String dni;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cliente() {
        SQLConexion con = new SQLConexion();
        cn = con.getConexion();
    }

    public void LLenarDatosCli(DefaultTableModel modelo) {
        try {
            String sql = "select * from Cliente";
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

    public void AgregarCli(String nombre, String apellido, String dni) {
        try {
            String sql = "execute PR_ADI_CLI ?,?,?";
            PreparedStatement cmd = cn.prepareCall(sql);
            cmd.setString(1, nombre);
            cmd.setString(2, apellido);
            cmd.setString(3, dni);
            cmd.execute();
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void BuscarDatosCli(DefaultTableModel modelo, String buscarC) {
        try {
            String sql = "SELECT * FROM CLIENTE WHERE cod_cli LIKE '%" + buscarC + "%' OR nombre LIKE '%" + buscarC
                    + "%'OR apellido LIKE '%" + buscarC + "%' OR Dni LIKE '%" + buscarC + "%'";
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
