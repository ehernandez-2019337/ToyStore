/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emerh
 */
public class Conexion {

   private static Conexion instancia;
private final String base = "db_toystore?useSSL=false";
private final String user = "root";
private final String password = "admin";
private final String url = "jdbc:mysql://localhost:3306/" + base;
private Connection conexion = null;

    /**
     * este metodo permite conectarnos 
     * @return conexion
     */
    public Connection getConexion()
    {
            try{
               Class.forName("com.mysql.cj.jdbc.Driver");
               conexion = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            }catch(SQLException e){
                System.err.println(e);
            }catch (ClassNotFoundException ex){
               Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return conexion;
    }
    /**
     * retorna la instancia de la conexion 
     * @return instancia
     */
    
        public synchronized static Conexion getInstancia(){
        if(instancia == null)
            instancia = new Conexion();
        return instancia;
    }
}
