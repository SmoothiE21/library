/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Szalma Szilard
 */
public class konyvtaros {
    public String azonosito;
    public String nev;
    public String cim;
    public String Email;
    public int tel;
    public String jelszo;

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setJelszo(String jelszo) {
        this.jelszo = jelszo;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public String getEmail() {
        return Email;
    }

    public int getTel() {
        return tel;
    }

    public String getJelszo() {
        return jelszo;
    }
    
    
    public konyvtaros(String azonosito,String nev,String cim,String Email,int tel, String jelszo  ){
        this.azonosito=azonosito;
        this.nev=nev;
        this.cim=cim;
        this.Email=Email;
        this.tel=tel;
        this.jelszo=jelszo;
    }
}
