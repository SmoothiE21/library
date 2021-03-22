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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
    
    public void felhasznaloListaToXML(){
        try{
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Users");
        doc.appendChild(rootElement);
        
        for(Felhasznalo uu : userlist){
       	    Element user = doc.createElement("User");
            rootElement.appendChild(user);
            user.setAttribute("Azonositó", uu.getAzonosito());
            
            Element nev = doc.createElement("Név");
            nev.appendChild(doc.createTextNode(uu.getNev()));
            user.appendChild(nev);
            
            Element cim = doc.createElement("Cim");
            cim.appendChild(doc.createTextNode(uu.getCim()));
            user.appendChild(cim);
            
            
            Element email = doc.createElement("Email");
            email.appendChild(doc.createTextNode(uu.getEmail()));
            user.appendChild(email);
            
            Element tel = doc.createElement("Tel");
            Integer i = uu.getTel();
            tel.appendChild(doc.createTextNode(i.toString()));
            user.appendChild(tel);
            

        }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            var result = new StreamResult(new File("userlist.xml"));
            
            transformer.transform(source, result);
 
            System.out.println("File saved!");
         
    }catch(ParserConfigurationException | TransformerException | DOMException e){
    }
        
    }
    
    public Boolean felhasznaloListaBetoltesXML(){
        try{
             File fXmlFile = new File("userlist.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

	
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("User");
            userlist.clear();
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    
                    Felhasznalo userss = new Felhasznalo();
                            userss.setAzonosito(eElement.getAttribute("Azonositó"));
                            userss.setNev(eElement.getElementsByTagName("Név").item(0).getTextContent());
                            userss.setCim(eElement.getElementsByTagName("Cim").item(0).getTextContent());
                            userss.setEmail(eElement.getElementsByTagName("Email").item(0).getTextContent());
                            userss.setTel(Integer.parseInt(eElement.getElementsByTagName("Tel").item(0).getTextContent()));

                         
                            userlist.add(userss);

                    System.out.println("Azonositó : " + eElement.getAttribute("Azonositó"));
                    System.out.println("Név: " + eElement.getElementsByTagName("Név").item(0).getTextContent());
                    System.out.println("Cim : " + eElement.getElementsByTagName("Cim").item(0).getTextContent());
                    System.out.println("Email: " + eElement.getElementsByTagName("Email").item(0).getTextContent());
                    System.out.println("Tel : " + eElement.getElementsByTagName("Tel").item(0).getTextContent());
                }
            }
            return true;
        }catch(IOException | ParserConfigurationException | DOMException | SAXException e){
        }
        return false;
    }   
}

    

