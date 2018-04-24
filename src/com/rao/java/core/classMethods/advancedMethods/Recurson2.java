package com.rao.java.core.classMethods.advancedMethods;

public class Recurson2 {

    public static void main(String args[]) {
        RecTest ob = new RecTest(10);
        int i;
        for(i=0; i<10; i++) ob.values[i] = i;       //observe array called with object.variable style
        ob.printArray(10);
    }
}

class RecTest {
    int values[];
    RecTest(int i) {                        //constructor
        values = new int[i];
    }
    // display array -- recursively
    void printArray(int i) {
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}