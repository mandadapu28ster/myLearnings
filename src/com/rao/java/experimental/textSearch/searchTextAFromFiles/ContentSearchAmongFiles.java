package com.rao.java.experimental.textSearch.searchTextAFromFiles;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ContentSearchAmongFiles {

    //private static String filepath = null;

    static String filepath = System.getProperty("user.dir");
    private static String defaultPath = filepath + "/Files";

    //private static final String defaultPath = "//sample_text";

    private ContentSearchAmongFiles() {
        this.filepath = defaultPath;
    }

    private ContentSearchAmongFiles(String dir) {
        if (dir.isEmpty()) {
            this.filepath = defaultPath;
        } else {
            this.filepath = dir;
        }
    }

    public static void main(String[] args) throws IOException {
        ContentSearchAmongFiles search = new ContentSearchAmongFiles();

        String folderToSearch = search.filepath;

        File folder = new File(folderToSearch);
        Set<File> list = new HashSet<File>();
        search.getFiles(folder, list);

        String toSearch = "700020276";
        for (File file : list) {
            BruteForceSearch bSerch = new BruteForceSearch(file);
            bSerch.search(toSearch);
        }
    }

    private void getFiles(File folder, Set<File> list) {

        folder.setReadOnly();
        File[] files = folder.listFiles();
        for (int j = 0; j < files.length; j++) {
            list.add(files[j]);
            if (files[j].isDirectory())
                getFiles(files[j], list);
        }
    }

}

