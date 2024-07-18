/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author emerh
 */
public class ControlDelCliente {
    public void agregarCliente(Cliente alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresar_cliente(?,?,?,?,?,?,?,?,?);");
            sentencia.setString(1, alumno.getNombreCliente());
            sentencia.setString(2, alumno.getApellidoCliente());
            sentencia.setString(3, alumno.getTelefono());
            sentencia.setString(4, alumno.getCorreo());
            sentencia.setString(5,alumno.getNitCliente());            
            sentencia.setString(6,alumno.getUsuario());
            sentencia.setString(7,alumno.getContrasenia());
            sentencia.setBoolean(8, true);
            sentencia.setBoolean(9, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha ingresado Corectamente" );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
    public void actualizar_Cliente(Cliente alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_cliente(?,?,?,?,?,?,?,?,?,?);");
            sentencia.setInt(1, alumno.getIdCliente());        
            sentencia.setString(2, alumno.getNombreCliente());
            sentencia.setString(3, alumno.getApellidoCliente());
            sentencia.setString(4, alumno.getTelefono());
            sentencia.setString(5, alumno.getCorreo());
            sentencia.setString(6, alumno.getNitCliente());
            sentencia.setString(7, alumno.getUsuario());
            sentencia.setString(8, alumno.getContrasenia());
            sentencia.setBoolean(9, true);
            sentencia.setBoolean(10, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Actualizado un Usuario en la Base de " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
    
     public void Eliminar_Cliente(Cliente alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminar_cliente(?,?);");
            sentencia.setInt(1, alumno.getIdCliente());       
            sentencia.setBoolean(2, false);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Eliminado un Usuario en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
}
