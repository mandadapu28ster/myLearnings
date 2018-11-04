package com.rao.java.algorithams.StringSpecific;

import java.util.Scanner;

public class PlayWithStrings {
    /**
     * Reverses complete line : LineLettersReversal
     * Reverse words ata the same place in line :LineWordsReversal
     * Reverse the words order in Line: WordsOrderReverse
     * @param args
     */

    private static String LineLettersReversal(String string){
        String ReverseLine ="";
        for (int j = string.length()-1; j >= 0; j--)
        {
            /* The charAt() function returns the character
             * at the given position in a string
             */
            ReverseLine = ReverseLine + string.charAt(j);
        }
        return ReverseLine;
    }

    private static String LineWordsReversal(String string){
        String ReverseLine="";
        String[] words=string.split(" ");
        for(int i=0;i<words.length;i++) {

            String Word=words[i];
            String ReverseWord="";
            for (int j = Word.length()-1; j >= 0; j--)
                ReverseWord = ReverseWord+Word.charAt(j);
            ReverseLine=ReverseLine+ReverseWord+" ";
        }
        return ReverseLine;
    }

    private String WordsOrderReverse(String string){
        String Reversed="";
        String[] Words=string.split(" ");
        for(int i=Words.length-1;i>=0;i--)
            Reversed=Reversed+Words[i]+ " ";
        return Reversed;
    }

    public static void main(String args[]){
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        /**
         * to call WordsOrderReverse method , remembering non static method calling
         */
        PlayWithStrings play=new PlayWithStrings();
        System.out.println(play.WordsOrderReverse(name));
        System.out.println(LineWordsReversal(name));
        System.out.println(LineLettersReversal(name));
    }
}
