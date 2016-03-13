/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventarios;

/**
 *
 * @author Personal
 */
public class Facturación {
    String RFC;
    String RS;
    String Calle;
    String NE;
    String NI;
    String Colonia;
    String Localidad;
    String DM;
    String Estado;
    String Pais;
    String CP;
    String EM;

    public Facturación(String RFC, String RS, String Calle, String NE, String NI, String Colonia, String Localidad, String DM, String Estado, String Pais, String CP, String EM) {
        this.RFC = RFC;
        this.RS = RS;
        this.Calle = Calle;
        this.NE = NE;
        this.NI = NI;
        this.Colonia = Colonia;
        this.Localidad = Localidad;
        this.DM = DM;
        this.Estado = Estado;
        this.Pais = Pais;
        this.CP = CP;
        this.EM = EM;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getRS() {
        return RS;
    }

    public void setRS(String RS) {
        this.RS = RS;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getNE() {
        return NE;
    }

    public void setNE(String NE) {
        this.NE = NE;
    }

    public String getNI() {
        return NI;
    }

    public void setNI(String NI) {
        this.NI = NI;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getDM() {
        return DM;
    }

    public void setDM(String DM) {
        this.DM = DM;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getEM() {
        return EM;
    }

    public void setEM(String EM) {
        this.EM = EM;
    }
    
    
}
