/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emerh
 */
public class Proveedor {
   private int idProveedor;
   private String nombreProveedor;
   boolean estadoActivo;
   
   public Proveedor(){
       
   }
   public Proveedor(int idProveedor, String nombreProveedor, boolean estadoActivo) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.estadoActivo = estadoActivo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    
}
