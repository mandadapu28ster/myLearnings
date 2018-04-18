package com.rao.java.experimental;

/**
 * This class will extract the data from PDF files range of page selection and print.
 */

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PDFBoxTextStripper {

    static String localDir = System.getProperty("user.dir");
    private static String filePath = localDir + "/Files/test.pdf";

    public static void main(String args[]) throws IOException {

        PDDocument document = PDDocument.load(new File(filePath));

        if (!document.isEncrypted()) {
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage(2);
            stripper.setEndPage(2);
            String text = stripper.getText(document);
            System.out.println("Text:" + text);
        }
        document.close();

    }
}
