/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projekt1;

/**
 *
 * @author Szalma Szilard
 */
import java.util.ArrayList;
import java.util.List;

public class Book implements java.io.Serializable {
    
    private String azonosito;
    private String cim;
    private String iro;
    private String kiado;
    private int kiadas_eve;
    private ArrayList<String> targyszavak ;
    private  boolean hozzaferheto;




        public Book(String azonosito, String cim, String iro, String kiado, int kiadas_eve, boolean hozzaferheto,ArrayList<String> targyszavak) {
        this.azonosito = azonosito;
        this.cim = cim;
        this.iro = iro;
        this.kiado = kiado;
        this.kiadas_eve = kiadas_eve;
        this.targyszavak = targyszavak;
        this.hozzaferheto = hozzaferheto;
    } 
    
 

    

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setIro(String iro) {
        this.iro = iro;
    }

    public void setKiado(String kiado) {
        this.kiado = kiado;
    }

    public void setKiadas_eve(int kiadas_eve) {
        this.kiadas_eve = kiadas_eve;
    }

    public void setTargyszavak(ArrayList<String> targyszavak) {
        this.targyszavak = targyszavak;
    }

    public void setHozzaferheto(boolean hozzaferheto) {
        this.hozzaferheto = hozzaferheto;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public String getCim() {
        return cim;
    }

    public String getIro() {
        return iro;
    }

    public String getKiado() {
        return kiado;
    }

    public int getKiadas_eve() {
        return kiadas_eve;
    }

    public ArrayList<String> getTargyszavak() {
        return targyszavak;
    }

    public boolean isHozzaferheto() {
        return hozzaferheto;
    }

  //  public Book(String azonosito, String cim, String iro, String kiado, int kiadas_eve, ArrayList<String> targyszavak, boolean hozzaferheto) {
      //  this.azonosito = azonosito;
       // this.cim = cim;
      //  this.iro = iro;
      //  this.kiado = kiado;
      //  this.kiadas_eve = kiadas_eve;
       // this.targyszavak = targyszavak;
       // this.hozzaferheto = hozzaferheto;
   // } 
}
