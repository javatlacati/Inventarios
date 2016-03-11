/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

/**
 *
 * @author Ignacio Hernandez
 */
public class Productos01 {
    String impresora;
    String tipodeimpresora;
    String marca;
    String modelo;
    String noserie;

    public Productos01(String impresora, String tipodeimpresora, String marca, String modelo, String noserie) {
        this.impresora = impresora;
        this.tipodeimpresora = tipodeimpresora;
        this.marca = marca;
        this.modelo = modelo;
        this.noserie = noserie;
    }

    public void setImpresora(String impresora) {
        this.impresora = impresora;
    }

    public void setTipodeimpresora(String tipodeimpresora) {
        this.tipodeimpresora = tipodeimpresora;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNoserie(String noserie) {
        this.noserie = noserie;
    }

    public String getImpresora() {
        return impresora;
    }

    public String getTipodeimpresora() {
        return tipodeimpresora;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNoserie() {
        return noserie;
    }
    
}
