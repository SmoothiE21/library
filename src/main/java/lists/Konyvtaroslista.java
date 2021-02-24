/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import classes.konyvtaros;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Szalma Szilard
 */
public class Konyvtaroslista {
    public List<konyvtaros> konyvtaroslist; 
    
    public Konyvtaroslista(){
        konyvtaroslist = new ArrayList<konyvtaros>();
    }

    public void csatolLista(konyvtaros alkalmazott){
        konyvtaroslist.add(alkalmazott);
    }
    
    public Boolean torles(String Azonosito){
        for(konyvtaros alkalmazott : konyvtaroslist){
            if(alkalmazott.getAzonosito().equals(Azonosito))
                konyvtaroslist.remove(alkalmazott);
            return true;
        }
        return false;
    }

    public void KiListaz(){
        for(konyvtaros alkalmazott : konyvtaroslist)
            
        System.out.println("Azonositó: "+ alkalmazott.getAzonosito()+ "\n" + "Név: " +  alkalmazott.getNev()+ "\n" + "Cim: " +alkalmazott.getCim()+ "\n"+ "Email: " + alkalmazott.getEmail()+ "\n"+ "Telefonszám: " + alkalmazott.getTel()+"\n"+ "Jelszó: " + alkalmazott.getJelszo()+"\n");
    }
    
    public  konyvtaros Kereses(String Azonosito){
        for(konyvtaros alkalmazott : konyvtaroslist){
            if(alkalmazott.getAzonosito().equals(Azonosito))
                return alkalmazott;
            
        }
        return null;
    }
    
    public Boolean KonyvtaroslistaMentes(){
        String filename = "konyvtarosok.txt";
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(konyvtaroslist);
            out.close();
            file.close();
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return false;
    }
    
    public List<konyvtaros> KonyvtaroslistaBetoltesFROMTXT(){
        String filename = "konyvtarosok.txt";
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream out2 = new ObjectInputStream(file);
   
            List<konyvtaros> uj_Lista = new ArrayList<konyvtaros>();
            uj_Lista = (List<konyvtaros>) out2.readObject();
            konyvtaroslist = uj_Lista;
            return uj_Lista;
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return null;
    }
    
    public int Meret(){
        return konyvtaroslist.size();
    }
    
    public void ListaModositbyNev(String EredetiNev){
        for (konyvtaros alkalmazott: konyvtaroslist)
        {
            if(alkalmazott.getNev().equals(EredetiNev)){
                Scanner scan = new Scanner(System.in);
                String UjNev= scan.nextLine();
                alkalmazott.setNev(UjNev);
            }
        System.out.println(alkalmazott.getNev());
    }
}
    
    public void ListaModositbyAzonosito(String EredetiAzonosito){
        for (konyvtaros alkalmazott: konyvtaroslist)
        {
            if(alkalmazott.getAzonosito().equals(EredetiAzonosito)){
                Scanner scan = new Scanner(System.in);
                String UjAzonosito= scan.nextLine();
                alkalmazott.setAzonosito(UjAzonosito);
            }
        System.out.println(alkalmazott.getAzonosito());
    }
}  
}
