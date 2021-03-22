/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import classes.Book;
import classes.Felhasznalo;
import classes.konyvtaros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
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
    
    public void konyvtarosListaToXML(){
        try{
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Librarians");
        doc.appendChild(rootElement);
        
        for(konyvtaros bb : konyvtaroslist){
       	    Element librarian = doc.createElement("Librarian");
            rootElement.appendChild(librarian);
            librarian.setAttribute("Azonositó", bb.getAzonosito());
            
            Element nev = doc.createElement("Név");
            nev.appendChild(doc.createTextNode(bb.getNev()));
            librarian.appendChild(nev);
            
            Element cim = doc.createElement("Cim");
            cim.appendChild(doc.createTextNode(bb.getCim()));
            librarian.appendChild(cim);
            
            
            Element email = doc.createElement("Email");
            email.appendChild(doc.createTextNode(bb.getEmail()));
            librarian.appendChild(email);
            
            Element tel = doc.createElement("Tel");
            Integer i = bb.getTel();
            tel.appendChild(doc.createTextNode(i.toString()));
            librarian.appendChild(tel);
            
            Element pw = doc.createElement("Jelszó");
            pw.appendChild(doc.createTextNode(bb.getJelszo()));
            librarian.appendChild(pw);
            

            

        }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            var result = new StreamResult(new File("librarianlist.xml"));
            
            transformer.transform(source, result);
 
            System.out.println("File saved!");
         
    }catch(ParserConfigurationException | TransformerException | DOMException e){
    }
        
    }
    
    public Boolean konyvtarosListaBetoltesXML(){
        try{
             File fXmlFile = new File("librarianlist.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

	
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("Librarian");
            konyvtaroslist.clear();
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    
                    konyvtaros librarians = new konyvtaros();
                            librarians.setAzonosito(eElement.getAttribute("Azonositó"));
                            librarians.setNev(eElement.getElementsByTagName("Név").item(0).getTextContent());
                            librarians.setCim(eElement.getElementsByTagName("Cim").item(0).getTextContent());
                            librarians.setEmail(eElement.getElementsByTagName("Email").item(0).getTextContent());
                            librarians.setTel(Integer.parseInt(eElement.getElementsByTagName("Tel").item(0).getTextContent()));
                             librarians.setJelszo(eElement.getElementsByTagName("Jelszó").item(0).getTextContent());


                         
                            konyvtaroslist.add(librarians);

                    System.out.println("Azonositó : " + eElement.getAttribute("Azonositó"));
                    System.out.println("Név: " + eElement.getElementsByTagName("Név").item(0).getTextContent());
                    System.out.println("Cim : " + eElement.getElementsByTagName("Cim").item(0).getTextContent());
                    System.out.println("Email: " + eElement.getElementsByTagName("Email").item(0).getTextContent());
                    System.out.println("Tel : " + eElement.getElementsByTagName("Tel").item(0).getTextContent());
                    System.out.println("Jelszó : " + eElement.getElementsByTagName("Jelszó").item(0).getTextContent());
                }
            }
            return true;
        }catch(IOException | ParserConfigurationException | DOMException | SAXException e){
        }
        return false;
    }   
}

