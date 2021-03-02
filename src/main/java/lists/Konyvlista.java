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
import java.io.IOException;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
            try (FileOutputStream file = new FileOutputStream(filename); ObjectOutputStream out = new ObjectOutputStream(file)) {
                out.writeObject(konyvek);
            }
        }catch(IOException e){
        }
        return false;
    }
    
    public List<Book> konyvlistaBetoltesFROMTXT(){
        String filename = "konyvek.txt";
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream out2 = new ObjectInputStream(file);
   
            List<Book> uj_Lista = new ArrayList<>();
            uj_Lista = (List<Book>) out2.readObject();
            konyvek = uj_Lista;
            return uj_Lista;
        }catch(IOException | ClassNotFoundException e){
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
            
             Element hozzaferheto = doc.createElement("Hozzáférhető");
             Boolean h =kk.isHozzaferheto();
            hozzaferheto.appendChild(doc.createTextNode(h.toString()));
            book.appendChild(hozzaferheto);
            
            

        }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("booklist.xml"));
            
            transformer.transform(source, result);
 
            System.out.println("File saved!");
         
    }catch(ParserConfigurationException | TransformerException | DOMException e){
    }
        
    }
     
    public Boolean konyvListaBetoltesXML(){
        try{
             File fXmlFile = new File("booklist.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

	
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("Book");
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("Azonositó : " + eElement.getAttribute("Azonositó"));
                    System.out.println("Cim : " + eElement.getElementsByTagName("Cim").item(0).getTextContent());
                    System.out.println("Iró : " + eElement.getElementsByTagName("Iró").item(0).getTextContent());
                    System.out.println("Kiadó: " + eElement.getElementsByTagName("Kiado").item(0).getTextContent());
                    System.out.println("Kiadás Éve : " + eElement.getElementsByTagName("KiadásEve").item(0).getTextContent());
                    System.out.println("Hozzáférhető : " + eElement.getElementsByTagName("Hozzáférhető").item(0).getTextContent());
                    
                }
            }
            return true;
        }catch(IOException | ParserConfigurationException | DOMException | SAXException e){
        }
        return false;
    }   
   
}
