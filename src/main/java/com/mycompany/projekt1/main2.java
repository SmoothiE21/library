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
public class main2 {
    public static void main(String[] args) {
        System.out.println("hello");
        Book konyv1 = new Book("11a", "Ocean", "Szalma","Java", 1998,true);
        Book konyv2 = new Book("11b", "Onterfeld", "Szilard","Kill", 2007,true);
        Konyvlista lista = new Konyvlista();
        lista.csatolLista(konyv1);
        lista.csatolLista(konyv2);
        lista.KiListaz(); 
    //  System.out.println(lista.Meret());
    //  lista.KonyvlistaMentes(); 
    //  Konyvlista betoltottlista= new Konyvlista();
    //    betoltottlista.konyvlistaBetoltesFROMTXT();     
    //  betoltottlista.kiListaz();
    //   lista.ListaModosit("Ocean");
    // lista.KiListaz();
      
    } 
}
