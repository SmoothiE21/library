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
import lists.Kolcsonlista;
import lists.Konyvlista;
import lists.Felhasznalolista;
import lists.Konyvtaroslista;
import classes.Felhasznalo;
import classes.Book;
import classes.konyvtaros;
import classes.kolcson;
import java.util.ArrayList;
import classes.ConsoleColors;
import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
  
        
Konyvlista lista1 = new Konyvlista();
Felhasznalolista lista2 = new Felhasznalolista();
Konyvtaroslista lista3 = new Konyvtaroslista();
Kolcsonlista lista4 = new Kolcsonlista();


ArrayList<String> targyszavak = new ArrayList<>();
       targyszavak.add("fiction");
       targyszavak.add("mystery");
        
   Book konyv1 = new Book("a","Harry Potter-Philosopher's Stone","J. K. Rowling","Bloomsbury Publishing (UK)",1997,true,targyszavak);
   Book konyv2 = new Book("b","Harry Potter-Chamber of Secrets","J. K. Rowling","Bloomsbury Publishing (UK)",1998,true,targyszavak);
   Book konyv3 = new Book("c","Harry Potter-Prisoner of Azkaban","J. K. Rowling","Bloomsbury Publishing (UK)",1999,true,targyszavak);
   Book konyv4 = new Book("d","Harry Potter-Goblet of Fire","J. K. Rowling","Bloomsbury Publishing (UK)",2000,true,targyszavak);
   Book konyv5 = new Book("e","Harry Potter-Order of the Phoenix","J. K. Rowling","Bloomsbury Publishing (UK)",2003,true,targyszavak);
   Book konyv6 = new Book("f","Harry Potter-Half-Blood Prince","J. K. Rowling","Bloomsbury Publishing (UK)",2005,true,targyszavak);
   Book konyv7 = new Book("g","Harry Potter-Deathly Hallows","J. K. Rowling","Bloomsbury Publishing (UK)",2007,true,targyszavak);
   Book konyv8 = new Book("h","Harry Potter-Deathly Hallows","J. K. Rowling","Bloomsbury Publishing (UK)",2007,true,targyszavak);
   Book konyv9 = new Book("i","Harry Potter-Deathly Hallows","J. K. Rowling","Bloomsbury Publishing (UK)",2007,true,targyszavak);
   Book konyv10 = new Book("j","Life After Covid-19","Szalma Szilárd","Láng",2025,true,targyszavak);
   Felhasznalo user1= new Felhasznalo("1f","Szalma Szilárd","Balavásár, Str. Principala, Nr. 318 ", "szalma.szilard@student.ms.sapientia.ro",07433241);
   Felhasznalo user2= new Felhasznalo("2f","András Andrea","Gyergyóditró, Str. Gábor Áron, Nr.34 ", "andrea.andras@student.ms.sapientia.ro",07433242);
   Felhasznalo user3= new Felhasznalo("3f","Pál Inka","Szeszvásár, Str. Köményes, Nr.75 ", "nonalcoholist@ms.whiskey.ro",07433241);
   konyvtaros dolgozo1=new konyvtaros("1d","Könyvmoly Katalin","Marosvásárhely, Fortuna,BL25,Nr.8", "kkatalin@gmail.ro", 075464567,"ilovebooks" );
   konyvtaros dolgozo2=new konyvtaros("2d","Zokni György","Marosvásárhely, December1,BL14,Nr.2", "lyukaszokni@yahoo.com", 075434507,"oldspice" );
  // Scanner scan = new Scanner(System.in);
    //  System.out.println("Kölcsönzés........."+'\n');
      //System.out.println("Kérem adja meg a könyv azonositóját: "+'\n');
   //String a=scan.nextLine();
     // System.out.println("Kérem adja meg a felhasználó azonositóját: "+'\n');
   //String b=scan.nextLine();
     // System.out.println("Kérem adja meg a saját azonositóját: "+'\n');
   //String c=scan.nextLine();
  //kolcson kolcsonzes1= new kolcson("1e",a,b,c,LocalDate.of(2017, 1, 13),LocalDate.of(2017, 1, 27));
   
   

    lista1.csatolLista(konyv1);
    lista1.csatolLista(konyv2);
    lista1.csatolLista(konyv3);
    lista1.csatolLista(konyv4);
    lista1.csatolLista(konyv5);
    lista1.csatolLista(konyv6);
    lista1.csatolLista(konyv7);
    lista1.csatolLista(konyv8);
    lista1.csatolLista(konyv9);
    lista1.csatolLista(konyv10);
 
 // lista1.konyvlistaBetoltesFROMTXT();
 // lista1.KiListaz();
 // System.out.println("A könyvtárban található könyvek száma: "+lista1.Meret());



//lista2.csatolLista(user1);
//lista2.csatolLista(user2);
//lista2.csatolLista(user3);
//lista2.FelhasznaloListaMentes();

//lista2.FelhasznaloListaBetoltesFROMTXT();
//lista2.KiListaz();
//System.out.println("A könyvtár jelenlegi felhasználói: " + lista2.Meret());
//System.out.println(ConsoleColors.RED + "RED COLORED");

//lista3.csatolLista(dolgozo1);
//lista3.csatolLista(dolgozo2);
//lista3.KonyvtaroslistaMentes();
//lista3.KonyvtaroslistaBetoltesFROMTXT();
//lista3.KiListaz();

//lista4.csatolLista(kolcsonzes1);
//lista4.KolcsonMentes();
//lista4.KolcsonListaBetoltesFROMTXT();
//lista4.KiListaz();
//System.out.println("Kölcsönök száma: "+lista4.KolcsonokSzama());
//lista1.konyvListaToXML();
//lista1.KonyvlistaMentes();
//lista1.konyvlistaBetoltesFROMTXT();
//lista1.KiListaz();


//lista1.torles("a");
//System.out.println(lista1.Meret());
//lista1.KiListaz();
//lista1.KonyvlistaMentes();
//lista1.konyvListaToXML();
lista1.konyvListaBetoltesXML();






    } 
}
