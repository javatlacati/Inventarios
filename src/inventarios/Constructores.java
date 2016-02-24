/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

/**
 *
 * @author david
 */
public class Constructores {

    public String getProductos() {
        return Productos;
    }

    public void setProductos(String Productos) {
        this.Productos = Productos;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }
    String Productos;
    String Cantidad;
    String Caracteristicas;
    String Serial;

    public Constructores(String Productos, String Cantidad, String Caracteristicas, String Serial) {
        this.Productos = Productos;
        this.Cantidad = Cantidad;
        this.Caracteristicas = Caracteristicas;
        this.Serial = Serial;
    }
}
