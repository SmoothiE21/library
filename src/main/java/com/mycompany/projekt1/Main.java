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
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
/*
        Books bookone = new Books();
        bookone.azonosito = 1;
        bookone.cim = "Ocean";
        bookone.kiado = "Alpha";
        bookone.kiadas_eve = 1998;
        bookone.iro = "Szalma Szilard";
        bookone.targyszavak = new ArrayList<>();
        bookone.targyszavak.add("kaland");
        bookone.hozzaferheto = true;

     

       try{
            FileOutputStream  fileOutputStream = new FileOutputStream("D:\\konyvek\\projekt1\\dokumentum.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(bookone);
            out.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in: \n dokumentum.txt ");
        }catch(IOException i){
            i.printStackTrace();
        }
       */
        
       


        Books bookone = null;
        try {
            FileInputStream fileIn = new FileInputStream("D:\\konyvek\\projekt1\\dokumentum.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            bookone = (Books) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Nem talalhato Book osztaly");
            c.printStackTrace();
            return;
        }
       
    
        System.out.println("Deserialized Book...");
        System.out.println("Cim: " + bookone.cim);
        System.out.println("Azonosito: " + bookone.azonosito);
        System.out.println("Iro: " + bookone.iro);
        System.out.println("Kiado: " + bookone.kiado);
        System.out.println("Kiadas eve: " + bookone.kiadas_eve);
        System.out.println("Kulcsszavak: " + bookone.targyszavak);
        System.out.println("Hozzaferheto: " + bookone.hozzaferheto);
        

    }


}
