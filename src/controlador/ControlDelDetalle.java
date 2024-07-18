/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.Compra;
import modelo.Detalle;

/**
 *
 * @author emerh
 */
public class ControlDelDetalle {
    public void agregarDetalle(Detalle alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_agregar_detalle(?,?,?);");
            sentencia.setInt(1,alumno.getIdCompra());  
            sentencia.setInt(2,alumno.getIdProducto());            
            sentencia.setBoolean(3, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha enviado realizado una compra exitosa" );
        }catch(Exception error){
            error.printStackTrace();
        }
       } 
}        
    
     