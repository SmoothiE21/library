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
public class kolcson {
    
    public String kolcsonazon;
    public String konyvazono;
    public String felhasznaloazon;
    public String konyvtarosazon;

    public String getKolcsonazon() {
        return kolcsonazon;
    }

    public String getKonyvazono() {
        return konyvazono;
    }

    public String getFelhasznaloazon() {
        return felhasznaloazon;
    }

    public String getKonyvtarosazon() {
        return konyvtarosazon;
    }
    
          
    
    public kolcson(String kolcsonazon, String konyvazon, String felhasznaloazon, String konyvtarosazon){
        this.felhasznaloazon= felhasznaloazon;
        this.konyvazono= konyvazon;
        this.kolcsonazon=kolcsonazon;
        this.konyvtarosazon=konyvtarosazon;
        
    }
    
}
