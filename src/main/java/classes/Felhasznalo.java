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


public class Felhasznalo implements java.io.Serializable  {
    public String azonosito;
    public String nev;
    public String cim;
    public String email;
    public int tel;

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(int tel) {
        this.tel = tel;
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
        return email;
    }

    public int getTel() {
        return tel;
    }
    
    public Felhasznalo(String azonosito, String nev, String cim, String email, int tel) {
        this.azonosito = azonosito;
        this.nev = nev;
        this.cim = cim;
        this.email = email;
        this.tel = tel;
    }
    
        public Felhasznalo() {
    }
}
