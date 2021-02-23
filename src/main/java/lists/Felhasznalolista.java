/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author Szalma Szilard
 */

import classes.Book;
import classes.Felhasznalo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Felhasznalolista implements Serializable{  
    public List<Felhasznalo> userlist; 
    
    public Felhasznalolista(){
        userlist = new ArrayList<Felhasznalo>();
    }

    public void csatolLista(Felhasznalo user){
        userlist.add(user);
    }
    
    public Boolean torles(String Azonosito){
        for(Felhasznalo user : userlist){
            if(user.getAzonosito().equals(Azonosito))
                userlist.remove(user);
            return true;
        }
        return false;
    }

    public void KiListaz(){
        for(Felhasznalo user : userlist)
            
        System.out.println("Név: "+ user.getNev()+  "\n" + "Azonositó: " +user.getAzonosito()+ "\n"+ "Cim: " + user.getCim()+ "\n"+ "Email: " + user.getEmail()+"\n"+ "Tel.: " + user.getTel()+ "\n" );
    }
    
    public  Felhasznalo Kereses(String Azonosito){
        for(Felhasznalo user : userlist){
            if(user.getAzonosito().equals(Azonosito))
                return user;
            
        }
        return null;
    }
    
    public Boolean FelhasznaloListaMentes(){
        String filename = "felhasznalok.txt";
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(userlist);
            out.close();
            file.close();
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return false;
    }
    
    public List<Felhasznalo> FelhasznaloListaBetoltesFROMTXT(){
        String filename = "felhasznalok.txt";
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream out2 = new ObjectInputStream(file);
   
            List<Felhasznalo> uj_Lista = new ArrayList<Felhasznalo>();
            uj_Lista = (List<Felhasznalo>) out2.readObject();
            userlist = uj_Lista;
            return uj_Lista;
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return null;
    }
    
    public int Meret(){
        return userlist.size();
    }
    
    public void FelhasznaloListaModositbyNev(String EredetiNev){
        for (Felhasznalo user: userlist)
        {
            if(user.getNev().equals(EredetiNev)){
                Scanner scan = new Scanner(System.in);
                String UjNev= scan.nextLine();
                user.setNev(UjNev);
            }
        System.out.println(user.getNev());
    }
}
    
    public void FelhasznaloListaModositbyAzonosito(String EredetiAzonosito){
        for (Felhasznalo user: userlist)
        {
            if(user.getAzonosito().equals(EredetiAzonosito)){
                Scanner scan = new Scanner(System.in);
                String UjAzonosito= scan.nextLine();
                user.setAzonosito(UjAzonosito);
            }
        System.out.println(user.getAzonosito());
    }
}
}
    

