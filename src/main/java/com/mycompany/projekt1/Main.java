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
import lists.Konyvlista;
import lists.Felhasznalolista;
import classes.Felhasznalo;
import classes.Book;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        
Konyvlista lista1 = new Konyvlista();
Felhasznalolista lista2 = new Felhasznalolista();


ArrayList<String> targyszavak = new ArrayList<>();
       targyszavak.add("fiction");
       targyszavak.add("mystery");
        
   Book konyv1 = new Book("1k","Harry Potter-Philosopher's Stone","J. K. Rowling","Bloomsbury Publishing (UK)",1997,true,targyszavak);
   Book konyv2 = new Book("2k","Harry Potter-Chamber of Secrets","J. K. Rowling","Bloomsbury Publishing (UK)",1998,true,targyszavak);
   Book konyv3 = new Book("3k","Harry Potter-Prisoner of Azkaban","J. K. Rowling","Bloomsbury Publishing (UK)",1999,true,targyszavak);
   Book konyv4 = new Book("4k","Harry Potter-Goblet of Fire","J. K. Rowling","Bloomsbury Publishing (UK)",2000,true,targyszavak);
   Book konyv5 = new Book("5k","Harry Potter-Order of the Phoenix","J. K. Rowling","Bloomsbury Publishing (UK)",2003,true,targyszavak);
   Book konyv6 = new Book("6k","Harry Potter-Half-Blood Prince","J. K. Rowling","Bloomsbury Publishing (UK)",2005,true,targyszavak);
   Book konyv7 = new Book("7k","Harry Potter-Deathly Hallows","J. K. Rowling","Bloomsbury Publishing (UK)",2007,true,targyszavak);
   Book konyv8 = new Book("8k","Harry Potter-Deathly Hallows","J. K. Rowling","Bloomsbury Publishing (UK)",2007,true,targyszavak);
   Book konyv9 = new Book("9k","Harry Potter-Deathly Hallows","J. K. Rowling","Bloomsbury Publishing (UK)",2007,true,targyszavak);
   Book konyv10 = new Book("10k","Life After Covid-19","Szalma Szilárd","Láng",2025,true,targyszavak);
   Felhasznalo user1= new Felhasznalo("1f","Szalma Szilárd","Balavásár, Str. Principala, Nr. 318 ", "szalma.szilard@student.ms.sapientia.ro",07433241);
   Felhasznalo user2= new Felhasznalo("2f","András Andrea","Gyergyóditró, Str. Gábor Áron, Nr.34 ", "andrea.andras@student.ms.sapientia.ro",07433242);
   Felhasznalo user3= new Felhasznalo("3f","Pál Inka","Szeszvásár, Str. Köményes, Nr.75 ", "nonalcoholist@ms.whiskey.ro",07433241);
   
   
   // lista1.csatolLista(konyv1);
  //  lista1.csatolLista(konyv2);
  //  lista1.csatolLista(konyv3);
  //  lista1.csatolLista(konyv4);
  //  lista1.csatolLista(konyv5);
  //  lista1.csatolLista(konyv6);
  //  lista1.csatolLista(konyv7);
  //  lista1.csatolLista(konyv8);
  //  lista1.csatolLista(konyv9);
  //  lista1.csatolLista(konyv10);
  //  lista1.KonyvlistaMentes();
 
 // lista1.konyvlistaBetoltesFROMTXT();
 // lista1.KiListaz();
 // System.out.println("A könyvtárban található könyvek száma: "+lista1.Meret());



//lista2.csatolLista(user1);
//lista2.csatolLista(user2);
//lista2.csatolLista(user3);
//lista2.FelhasznaloListaMentes();

lista2.FelhasznaloListaBetoltesFROMTXT();
lista2.KiListaz();
System.out.println("A könyvtár jelenlegi felhasználói: " + lista2.Meret());

  
    } 
}
