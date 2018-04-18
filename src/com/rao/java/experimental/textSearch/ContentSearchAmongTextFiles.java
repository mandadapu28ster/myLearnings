package com.rao.java.experimental.textSearch;

/**
 * This class will work for text, it will search for specific content which is available in files.
 */


import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;


public class ContentSearchAmongTextFiles {

    static String localDir = System.getProperty("user.dir");

    public static void main(String[] args) throws IOException {

        String textToMatch = "700020276";
        ArrayList<String> paths = new ArrayList<String>();
        String content;
        int found = 0;
        int notFound = 0;
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        };

        File path = new File(localDir+"/Files/");
        System.out.println(path);
        File[] listOfFiles = path.listFiles(filter);
        for (File file : listOfFiles) {
            content = FileUtils.readFileToString(file);
            if (content.contains(textToMatch)) {
                //System.out.println("Found in: " + file.getAbsolutePath());
                paths.add(file.getAbsolutePath());
                found++;
            } else {
                //System.out.println("No found\n" + content);
                notFound++;
            }
        }
        for (String pth : paths) {
            System.out.println(pth);
        }
        System.out.println("Found in " + found + " files.\nNot found in " + notFound + " files.");
    }
}
