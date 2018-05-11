package com.rao.java.core.multiThreading;

// This program is not synchronized.
class Callme {

    /**
     *
     * how to synchronise this program or method call ??
     *
     * Add 'synchronized' before method declaration first way of achieving sync
     *
     */

    /*synchronized */  void call(String msg) {              //un comment synchronized word to see effect
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);                     //this statement making thread to sleep, same time other object threads are entering when we don't have synchronized
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start(); }
    public void run() {


        /**
         *  Add 'synchronized' before method calling via object; second way of achieving sync
         */

//        synchronized(target) { // synchronized block
//            target.call(msg);
//        }

        target.call(msg);
    }
}

public class RacingAndThreadMethodSync {
    public static void main(String args[]) {
        Callme target = new Callme();

        /**
         * threee objects are using same method and trying to complete early by entering into it while other threads are sleeping in it..... hence racing without synchronized key word
         */

        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");
        // wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
