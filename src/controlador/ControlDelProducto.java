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
import org.emersonhernandez.vista.Producto;

/**
 *
 * @author emerh
 */
public class ControlDelProducto {
    public void agregarProducto(Productos alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresar_producto(?,?,?);");
            sentencia.setString(1, alumno.getNombreProducto());
            sentencia.setString(2, alumno.getPrecioProducto());
            sentencia.setBoolean(3, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null," se Ha ingresado Corectamente" );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
    public void actualizar_Producto(Productos alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_producto(?,?,?,?);");
            sentencia.setInt(1, alumno.getIdProducto());        
            sentencia.setString(2, alumno.getNombreProducto());
            sentencia.setString(3, alumno.getPrecioProducto());
            sentencia.setBoolean(4, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Actualizado un Producto en la Base de " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
    
     public void Eliminar_Producto(Productos alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminar_producto(?,?);");
            sentencia.setInt(1, alumno.getIdProducto());       
            sentencia.setBoolean(2, false);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Eliminado un Producto en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
}
