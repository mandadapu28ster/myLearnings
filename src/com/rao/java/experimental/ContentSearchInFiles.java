package com.rao.java.experimental;

/**
 * This class will work for both text and pdf files, it will search for specific content which is available in files.
 */

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;


public class ContentSearchInFiles {

    static String localDir = System.getProperty("user.dir");

    public static void main(String[] args) throws IOException {

        String textToMatch = "700020276";
        ArrayList<String> paths = new ArrayList<String>();
        String content = null;
        int found = 0;
        int notFound = 0;

//        FilenameFilter filter = new FilenameFilter() {
//            public boolean accept(File dir, String name) {
//                return name.endsWith(".txt");
//            }
//        };

        File path = new File(localDir+"/Files/");
        System.out.println(path);
        File[] listOfFiles = path.listFiles();
        for (File file : listOfFiles)
        {
            if(file.getName().endsWith(".txt")) {
                content = FileUtils.readFileToString(file);
            }
            else
                {
                    PDDocument document = PDDocument.load(file);
                    if (!document.isEncrypted())
                    {
                        PDFTextStripper stripper = new PDFTextStripper();
                        stripper.setStartPage(1);
                        stripper.setEndPage(1);
                        content = stripper.getText(document);
                    }
                    document.close();
                }

            if (content.contains(textToMatch)) {
                System.out.println("content is " + content);
                System.out.println("----------------------- ");
                paths.add(file.getAbsolutePath());
                found++;
            } else {
                notFound++;
            }
        }
        for (String pth : paths) {
            System.out.println(pth);
        }
        System.out.println("Found in " + found + " file(s).\nNot found in " + notFound + " file(s).");
    }
}
