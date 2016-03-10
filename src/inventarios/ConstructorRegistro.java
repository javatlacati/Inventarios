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
public class ConstructorRegistro {
    String producto;
    String fecharegistro;
    String lugarresgistro;
    String valormonetario;
    String encargadoregistro;

 public ConstructorRegistro(String producto,String fecharegistro,String lugarregistro,String valormonetario,String encargadoregisto){
        this.producto=producto;
        this.fecharegistro = fecharegistro;
        this.lugarresgistro = lugarregistro;
        this.valormonetario = valormonetario;
        this.encargadoregistro = encargadoregisto;
    }   
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getLugarresgistro() {
        return lugarresgistro;
    }

    public void setLugarresgistro(String lugarresgistro) {
        this.lugarresgistro = lugarresgistro;
    }

    public String getValormonetario() {
        return valormonetario;
    }

    public void setValormonetario(String valormonetario) {
        this.valormonetario = valormonetario;
    }

    public String getEncargadoregistro() {
        return encargadoregistro;
    }

    public void setEncargadoregistro(String encargadoregistro) {
        this.encargadoregistro = encargadoregistro;
    }
}
