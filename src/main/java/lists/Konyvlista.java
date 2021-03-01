/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;



import classes.Book;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Szalma Szilard
 */


public class Konyvlista implements  Serializable{ 
    public List<Book> konyvek; 
    
    public Konyvlista(){
        konyvek = new ArrayList<Book>();
    }

    public void csatolLista(Book konyv){
        konyvek.add(konyv);
    }
    
    public Boolean torles(String Azonosito){
        for(Book konyv : konyvek){
            if(konyv.getAzonosito().equals(Azonosito))
                konyvek.remove(konyv);
            return true;
        }
        return false;
    }

    public void KiListaz(){
        for(Book konyv : konyvek)
            
        System.out.println("Cim: "+ konyv.getCim()+ "\n" + "Iró: " +  konyv.getIro()+ "\n" + "Azonositó: " +konyv.getAzonosito()+ "\n"+ "Kiadás éve: " + konyv.getKiadas_eve()+ "\n"+ "Kiadó: " + konyv.getKiado()+"\n"+ "Elérheto: " + konyv.isHozzaferheto()+"\n" + "Tárgyszavak: " + konyv.getTargyszavak()+ "\n" );
    }
    
    public  Book Kereses(String Azonosito){
        for(Book konyv : konyvek){
            if(konyv.getAzonosito().equals(Azonosito))
                return konyv;
            
        }
        return null;
    }
    
    public Boolean KonyvlistaMentes(){
        String filename = "konyvek.txt";
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(konyvek);
            out.close();
            file.close();
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return false;
    }
    
    public List<Book> konyvlistaBetoltesFROMTXT(){
        String filename = "konyvek.txt";
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream out2 = new ObjectInputStream(file);
   
            List<Book> uj_Lista = new ArrayList<Book>();
            uj_Lista = (List<Book>) out2.readObject();
            konyvek = uj_Lista;
            return uj_Lista;
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return null;
    }
    
    public int Meret(){
        return konyvek.size();
    }
    
    public void ListaModositbyCim(String EredetiCim){
        for (Book konyv: konyvek)
        {
            if(konyv.getCim().equals(EredetiCim)){
                Scanner scan = new Scanner(System.in);
                String UjCim= scan.nextLine();
                konyv.setCim(UjCim);
            }
        System.out.println(konyv.getCim());
    }
}
    
    public void ListaModositbyAzonosito(String EredetiAzonosito){
        for (Book konyv: konyvek)
        {
            if(konyv.getAzonosito().equals(EredetiAzonosito)){
                Scanner scan = new Scanner(System.in);
                String UjAzonosito= scan.nextLine();
                konyv.setCim(UjAzonosito);
            }
        System.out.println(konyv.getAzonosito());
    }
}
    
     public void konyvListaToXML(){
        try{
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Books");
        doc.appendChild(rootElement);
        
        for(Book kk : konyvek){
       	    Element book = doc.createElement("Book");
            rootElement.appendChild(book);
            book.setAttribute("Azonositó", kk.getAzonosito());
            
            Element cim = doc.createElement("Cim");
            cim.appendChild(doc.createTextNode(kk.getCim()));
            book.appendChild(cim);
            
            Element iro = doc.createElement("Iró");
            iro.appendChild(doc.createTextNode(kk.getIro()));
            book.appendChild(iro);
            
            
            Element kiado = doc.createElement("Kiado");
            kiado.appendChild(doc.createTextNode(kk.getKiado()));
            book.appendChild(kiado);
            
            Element kiadasEve = doc.createElement("KiadásEve");
            Integer i = kk.getKiadas_eve();
            kiadasEve.appendChild(doc.createTextNode(i.toString()));
            book.appendChild(kiadasEve);
        }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("books.xml"));
            
            transformer.transform(source, result);
 
            System.out.println("File saved!");
         
    }catch(ParserConfigurationException | TransformerException | DOMException e){
    }
        
    }
   
}
