/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.Compra;

/**
 *
 * @author emerh
 */
public class ControlDelCompra {
    public void agregarCompra(Compra alumno){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_agregar_compra(?,?);");
            sentencia.setInt(1,alumno.getIdCliente());            
            sentencia.setBoolean(2, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha enviado un Alumno a la BD" );
        }catch(Exception error){
            error.printStackTrace();
        }
       } 
}        
    
     