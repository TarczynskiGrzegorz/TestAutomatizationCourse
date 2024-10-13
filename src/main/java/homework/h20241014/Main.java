package homework.h20241014;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(new File("src/main/java/homework/h20241014/cars.xml"));
        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName("cars");
        Node first = nodeList.item(0);

        NodeList childNodeList = first.getChildNodes();
        int n = childNodeList.getLength();
        Node current;
        for(int i=0; i<n; i++ ){
            current = childNodeList.item(i);
            if(current.getNodeType() == Node.ELEMENT_NODE){
                System.out.println(current.getNodeName() + ": " + current.getTextContent());
            }
        }
    }
}
