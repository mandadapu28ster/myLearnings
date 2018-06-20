package com.rao.java.algorithams;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

interface Stack<T>{
    void push (T number);
    T pop();
    T peak();
    boolean IsEmpty();
    boolean IsFull();
}

 class StackGeneral<T> implements Stack<T> {
    private int top;
     private Object[] array;
    public StackGeneral(int Size){
        this.array = new Object[Size];
        top=-1;
    }

    public boolean IsFull(){
        return top==array.length-1;
    }

    public boolean IsEmpty(){
        return top==-1;
    }

     public T pop(){
        if(this.IsEmpty())
            throw new EmptyStackException();
        return element(top--);
    }

     public T peak(){
        if(this.IsEmpty())
            throw new EmptyStackException();
        return element(top--);
    }

     public void push(T number) {
        if(this.IsFull())
            throw new RuntimeException("Stack's storage is overflow");
        System.out.println(number);
        array[++top]=number;
    }
     // Safe because push(T) is type checked.
     @SuppressWarnings("unchecked")
     private T element(int index) {
         return (T)array[index];
     }
 }


public class GenericStackImplementation {

    public static void main(String args[]) {
        String word="HelloWorld";
        Stack<Character> Stack = new StackGeneral<>(word.length());
        for(int i=0;i<word.length();i++)
            Stack.push(word.toCharArray()[i]);
        String reverse="";
        while (!Stack.IsEmpty()){
            char ch=(char)((StackGeneral<Character>) Stack).pop();
            reverse+=ch;
        }

        System.out.println("===>>"+reverse);
    }
}
