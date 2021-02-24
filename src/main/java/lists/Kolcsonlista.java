/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;
import classes.kolcson;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Szalma Szilard
 */
public class Kolcsonlista implements  Serializable {
    public List<kolcson> kolcsonlist; 
    
    public Kolcsonlista(){
        kolcsonlist = new ArrayList<kolcson>();
    }

    public void csatolLista(kolcson kolcsonzes){
        kolcsonlist.add(kolcsonzes);
    }
    
    public Boolean torles(String Azonosito){
        for(kolcson kolcsonzes : kolcsonlist){
            if(kolcsonzes.getKolcsonAzonosito().equals(Azonosito))
                kolcsonlist.remove(kolcsonzes);
            return true;
        }
        return false;
    }

    public void KiListaz(){
        for(kolcson kolcsonzes : kolcsonlist)
            
        System.out.println("Kölcsön Azonositó: "+ kolcsonzes.getKolcsonAzonosito()+ "\n" + "Könyvazonositó: " +  kolcsonzes.getBookAzonosito()+ "\n" + "Felhasználó Azonositó: " +kolcsonzes.getFelhasznaloAzonosito()+ "\n"+ "Könyvtáros Azonositó: " + kolcsonzes.getKonyvtarosAzonosito()+ "\n"+ "Kiadás Dátuma: " + kolcsonzes.getKolcsonDatum()+"\n"+ "Lejárati Dátum: " + kolcsonzes.getKolcsonLejarat()+"\n");
        
    }
    
    public Boolean KolcsonMentes(){
        String filename = "kolcson.txt";
        
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(kolcsonlist);
            out.close();
            file.close();
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return false;
        
    }
    
    public List<kolcson> KolcsonListaBetoltesFROMTXT(){
        String filename = "kolcson.txt";
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream out2 = new ObjectInputStream(file);
   
            List<kolcson> uj_Lista = new ArrayList<kolcson>();
            uj_Lista = (List<kolcson>) out2.readObject();
            kolcsonlist = uj_Lista;
            return uj_Lista;
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return null;
    }
    
    public int KolcsonokSzama(){
        return kolcsonlist.size();
    }
        
}
