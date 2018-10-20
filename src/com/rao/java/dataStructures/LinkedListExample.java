package com.rao.java.dataStructures;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]) {

            LinkedList<String> object=new LinkedList<String>();
            object.add("A");
            object.add("B");
            System.out.println("Linked list : " + object);
            object.addLast("C");
            object. addFirst("AA");
            System.out.println("Linked list : " + object);
            object.removeFirst();
            System.out.println(object.get(2));
            if(object.contains("A"))
                System.out.println("We have A in List");
            System.out.println(object.size());
    }
    }
