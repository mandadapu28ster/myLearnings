package com.rao.java.dataStructures.StackInOut;

import java.util.*;

public class StaackBasics {
    static void Stackpush(Stack<Integer> stack1){
        for(int i=0;i<5;i++){
            stack1.push(i);
        }
    }
    static void StackPop(Stack<Integer> stack2){
        System.out.println("Pop :");
        for(int i = 0; i < 5; i++)
        {
            int y = stack2.pop();
            System.out.println(y);
        }
    }

    static void StackPeek(Stack<Integer> stack3){
        int element = stack3.peek();
        System.out.println("Element on stack top : " + element);
    }

    static void StackSearch(Stack<Integer> stack4,int element){
        int pos = stack4.search(element);
        if(pos==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at : "+pos);
    }

    public static void main(String args[]){
        //Stack StackImplement= new Stack();

        Stack<Integer> StackImplement = new Stack<Integer>();

        Stackpush(StackImplement);
        StackSearch(StackImplement,2);
        StackPeek(StackImplement);
        StackPop(StackImplement);

        /**
         *Below commented code will give error because stack now empty, *stack after pop operation becomes empty*
         */
        //StackPeek(StackImplement);
    }
}
