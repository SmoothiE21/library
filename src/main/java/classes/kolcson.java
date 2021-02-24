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
import java.time.LocalDate;
public class kolcson implements java.io.Serializable {
    
    public String kolcsonAzonosito;
    public String bookAzonosito;
    public String felhasznaloAzonosito;
    public String konyvtarosAzonosito;
    public LocalDate kolcsonDatum;
    public LocalDate kolcsonLejarat;

    public String getKolcsonAzonosito() {
        return kolcsonAzonosito;
    }

    public String getBookAzonosito() {
        return bookAzonosito;
    }

    public String getFelhasznaloAzonosito() {
        return felhasznaloAzonosito;
    }

    public String getKonyvtarosAzonosito() {
        return konyvtarosAzonosito;
    }

    public LocalDate getKolcsonDatum() {
        return kolcsonDatum;
    }

    public LocalDate getKolcsonLejarat() {
        return kolcsonLejarat;
    }

    public void setKolcsonAzonosito(String kolcsonAzonosito) {
        this.kolcsonAzonosito = kolcsonAzonosito;
    }

    public void setBookAzonosito(String bookAzonosito) {
        this.bookAzonosito = bookAzonosito;
    }

    public void setFelhasznaloAzonosito(String felhasznaloAzonosito) {
        this.felhasznaloAzonosito = felhasznaloAzonosito;
    }

    public void setKonyvtarosAzonosito(String konyvtarosAzonosito) {
        this.konyvtarosAzonosito = konyvtarosAzonosito;
    }

    public void setKolcsonDatum(LocalDate kolcsonDatum) {
        this.kolcsonDatum = kolcsonDatum;
    }

    public void setKolcsonLejarat(LocalDate kolcsonLejarat) {
        this.kolcsonLejarat = kolcsonLejarat;
    }


    
          
    
    public kolcson(String kolcsonAzonosito, String bookAzonosito, String felhasznaloAzonosito, String konyvtarosAzonosito, LocalDate kolcsonDatum, LocalDate kolcsonLejarat){
        this.kolcsonAzonosito=kolcsonAzonosito;
        this.bookAzonosito=bookAzonosito;
        this.felhasznaloAzonosito=felhasznaloAzonosito;
        this.konyvtarosAzonosito=konyvtarosAzonosito;
        this.kolcsonDatum=kolcsonDatum;
        this.kolcsonLejarat=kolcsonLejarat;
    }
    
}
