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

public class main2 {
    public static void main(String[] args) {
ArrayList<String> targyszavak = new ArrayList<>();
        targyszavak.add("fantasy");
        targyszavak.add("scifi");
        Book konyv3 = new Book(
                "11a",
                "Lord of the rings",
                "J.R.R Tolkien",
                "Scientia",
                1976,
                true,
                targyszavak);
        
        System.out.println("hello");


        
 
        Konyvlista lista = new Konyvlista();
        
        targyszavak.remove("fantasy");
        targyszavak.remove("scifi");
         targyszavak.add("krimi");
          Book konyv4 = new Book(
                "11b",
                "Ocean",
                "Szalma",
                "Mokka",
                2007,
                true,
                targyszavak);
        
        
        
        
      //  lista.KiListaz(); 
    // System.out.println(lista.Meret());
    //  lista.KonyvlistaMentes(); 
      Konyvlista betoltottlista= new Konyvlista();
     // betoltottlista.konyvlistaBetoltesFROMTXT();     
    //  betoltottlista.KiListaz();
    // lista.ListaModosit("Lord of the rings");
  //   lista.KiListaz();
 // lista.torles("11a");
 // System.out.println(lista.Meret());
 //System.out.println(lista.Kereses("11a"));
 
  lista.csatolLista(konyv3);
  lista.csatolLista(konyv4);
 // System.out.println(lista.Meret());
 // lista.KiListaz(); 
 // lista.torles("11a");
 // System.out.println(lista.Meret());
 // lista.KiListaz();
// lista.torles("11a");
 System.out.println(lista.Meret());
 //lista.KiListaz();
 //System.out.println(betoltottlista.Meret());
 
// lista.KonyvlistaMentes();
// betoltottlista.konyvlistaBetoltesFROMTXT();
// betoltottlista.KiListaz();
 
 lista.torles("11a");
  lista.KonyvlistaMentes();
 betoltottlista.konyvlistaBetoltesFROMTXT();
  betoltottlista.KiListaz();
   System.out.println(betoltottlista.Meret());
  
  
  
 

 
 
  
      
    } 
}
