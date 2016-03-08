/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

/**
 *
 * @author francisco
 */
public class Productos {
    
    
    String producto;
    String cantidad;
    String caracteristicas;
    String serial;
    
    public Productos(String producto,String cantidad,String caracteristicas,String serial){
        this.producto=producto;
        this.cantidad=cantidad;
        this.caracteristicas=caracteristicas;
        this.serial=serial;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

        
        
    
    }
    

