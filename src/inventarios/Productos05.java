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
public class Productos05 {
    String resolucion;
    String proyector;
    String marca;
    String modelo;
    String noserie;
    String puertohdmi;
    String puertousb;

    public Productos05(String proyector, String marca, String modelo, String noserie, String puertohdmi, String puertousb,String resolucion) {
        this.proyector = proyector;
        this.marca = marca;
        this.modelo = modelo;
        this.noserie = noserie;
        this.puertohdmi = puertohdmi;
        this.puertousb = puertousb;
        this.resolucion = resolucion;
    }
    
    public String getResolucion(){
        return resolucion;
    }
    
    public void setResolucion() {
        this.resolucion = resolucion;
    }

    public String getProyector() {
        return proyector;
    }

    public void setProyector(String proyector) {
        this.proyector = proyector;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNoserie() {
        return noserie;
    }

    public void setNoserie(String noserie) {
        this.noserie = noserie;
    }

    public String getPuertohdmi() {
        return puertohdmi;
    }

    public void setPuertohdmi(String puertohdmi) {
        this.puertohdmi = puertohdmi;
    }

    public String getPuertousb() {
        return puertousb;
    }

    public void setPuertousb(String puertousb) {
        this.puertousb = puertousb;
    }
    
}
