/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emerh
 */
public class Compra {
    private int idCompra;
	private int idCliente;
        boolean estadoActivo;

        public Compra(){ 
        }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    public Compra(int idCompra, int idCliente, boolean estadoActivo) {
        this.idCompra = idCompra;
        this.idCliente = idCliente;
        this.estadoActivo = estadoActivo;
    }
}
        



    