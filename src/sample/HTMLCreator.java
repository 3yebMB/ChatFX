package sample;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class HTMLCreator {
//    String encoding = "UTF-8";
//    FileOutputStream fos = new FileOutputStream("myfile.html");
//    OutputStreamWriter writer = new OutputStreamWriter(fos, encoding);
//    StreamResult streamResult = new StreamResult(writer);
//
//    SAXTransformerFactory saxFactory = (SAXTransformerFactory) TransformerFactory.newInstance();
//    TransformerHandler tHandler = saxFactory.newTransformerHandler();
//
//    tHandler.setResult(streamResult);
//
//    Transformer transformer = tHandler.getTransformer();
//    transformer.setOutputProperty(OutputKeys.METHOD, "html");
//    transformer.setOutputProperty(OutputKeys.ENCODING, encoding);
//    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
//
//    writer.write("<!DOCTYPE html>\n");
//    writer.flush();
//    tHandler.startDocument();
//    tHandler.startElement("", "", "html", new AttributesImpl());
//    tHandler.startElement("", "", "head", new AttributesImpl());
//    tHandler.startElement("", "", "title", new AttributesImpl());
//    tHandler.characters("Hello".toCharArray(), 0, 5);
//    tHandler.endElement("", "", "title");
//    tHandler.endElement("", "", "head");
//    tHandler.startElement("", "", "body", new AttributesImpl());
//    tHandler.startElement("", "", "p", new AttributesImpl());
//    tHandler.characters("5 > 3".toCharArray(), 0, 5); // note '>' character
//    tHandler.endElement("", "", "p");
//    tHandler.endElement("", "", "body");
//    tHandler.endElement("", "", "html");
//    tHandler.endDocument();
//    writer.close();
}
