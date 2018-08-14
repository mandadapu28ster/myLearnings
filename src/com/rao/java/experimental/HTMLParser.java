package src.com.rao.java.experimental;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class HTMLParser {
    public static void main(String[] args) throws IOException {
        String location= "Files/Google/Google.html";
        if(findElementsInHTML(location,"css","lst-ib"))
            System.out.println("Works here");
    }


    public static boolean findElementsInHTML(String location,String type, String name) throws IOException{
        File input = new File(location);
        Document doc = Jsoup.parse(input, "UTF-8");
        try {
            switch (type) {
                case "id":
                    if (doc.getElementById(name).hasParent())
                        return true;
                case "css":
                    if (!(doc.select("#"+name).isEmpty()))
                        return true;
                default:
                    return false;
            }
        } catch(NullPointerException e) {
            return false;
        }
    }

}

