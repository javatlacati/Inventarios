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
public class Productos03 {
     String videoconferencias;
     String direccionip;
     String marca;
     String modelo;
     String noserie;

    public Productos03(String videoconferencias, String direccionip, String marca, String modelo, String noserie) {
        this.videoconferencias = videoconferencias;
        this.direccionip = direccionip;
        this.marca = marca;
        this.modelo = modelo;
        this.noserie = noserie;
    }

    public String getVideoconferencias() {
        return videoconferencias;
    }

    public void setVideoconferencias(String videoconferencias) {
        this.videoconferencias = videoconferencias;
    }

    public String getDireccionip() {
        return direccionip;
    }

    public void setDireccionip(String direccionip) {
        this.direccionip = direccionip;
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
    
}
