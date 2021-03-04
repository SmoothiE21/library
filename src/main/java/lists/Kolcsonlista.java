/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;
import classes.kolcson;
import classes.konyvtaros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
import java.time.LocalDate;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


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
    
    public void kolcsonListaToXML(){
        try{
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Kölcsönök");
        doc.appendChild(rootElement);
        
        for(kolcson xx : kolcsonlist){
       	    Element kolcson = doc.createElement("Kölcsön");
            rootElement.appendChild(kolcson);
            kolcson.setAttribute("Azonositó", xx.getKolcsonAzonosito());
            
            Element bookazon = doc.createElement("Könyvazonositó");
            bookazon.appendChild(doc.createTextNode(xx.getBookAzonosito()));
            kolcson.appendChild(bookazon);
            
            Element userazon = doc.createElement("Felhasználóazonositó");
            userazon.appendChild(doc.createTextNode(xx.getFelhasznaloAzonosito()));
            kolcson.appendChild(userazon);
            
            
            Element librarianazon = doc.createElement("Könyvtárosazonositó");
            librarianazon.appendChild(doc.createTextNode(xx.getKonyvtarosAzonosito()));
            kolcson.appendChild(librarianazon);
            
//            Element datum = doc.createElement("KölcsönDátum");
//            Local Date dat = xx.getKolcsonDatum();
//            datum.appendChild(doc.createTextNode(dat.toString()));
//            kolcson.appendChild(datum);
//            
//             Element datumle = doc.createElement("KölcsönLejárta");
//            Local Date datt = xx.getKolcsonLejarat();
//            datumle.appendChild(doc.createTextNode(datt.toString()));
//            kolcson.appendChild(datumle);
            
            

            

        }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            var result = new StreamResult(new File("kolcsonlist.xml"));
            
            transformer.transform(source, result);
 
            System.out.println("File saved!");
         
    }catch(ParserConfigurationException | TransformerException | DOMException e){
    }
        
    }
    
     public Boolean kolcsonListaBetoltesXML(){
        try{
             File fXmlFile = new File("kolcsonlist.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

	
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("Kölcsön");
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("Azonositó : " + eElement.getAttribute("Azonositó"));
                    System.out.println("Könyvazonositó : " + eElement.getElementsByTagName("Könyvazonositó").item(0).getTextContent());
                    System.out.println("Felhasználóazonositó : " + eElement.getElementsByTagName("Felhasználóazonositó").item(0).getTextContent());
                    System.out.println("Könyvtárosazonositó: " + eElement.getElementsByTagName("Könyvtárosazonositó").item(0).getTextContent());
                  //  System.out.println("KölcsönDátum : " + eElement.getElementsByTagName("KölcsönDátum").item(0).getTextContent());
                  //  System.out.println("KölcsönLejárta : " + eElement.getElementsByTagName("KölcsönLejárta").item(0).getTextContent());    
                }
            }
            return true;
        }catch(IOException | ParserConfigurationException | DOMException | SAXException e){
        }
        return false;
    }   
        
}
