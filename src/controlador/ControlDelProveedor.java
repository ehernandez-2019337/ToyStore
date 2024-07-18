/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Productos;
import modelo.Proveedor;
import org.emersonhernandez.vista.Producto;

/**
 *
 * @author emerh
 */
public class ControlDelProveedor {
    public void agregarProveedor(Proveedor alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresar_proveedor(?,?);");
            sentencia.setString(1, alumno.getNombreProveedor());
            sentencia.setBoolean(2, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null," se Ha ingresado Corectamente" );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
    public void actualizar_Proveedor(Proveedor alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_proveedor(?,?,?);");
            sentencia.setInt(1, alumno.getIdProveedor());        
            sentencia.setString(2, alumno.getNombreProveedor());
            sentencia.setBoolean(3, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Actualizado un Proveedor en la Base de " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
    
     public void Eliminar_Proveedor(Proveedor alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminar_provedor(?,?);");
            sentencia.setInt(1, alumno.getIdProveedor());       
            sentencia.setBoolean(2, false);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Eliminado un Proveedor en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
}
