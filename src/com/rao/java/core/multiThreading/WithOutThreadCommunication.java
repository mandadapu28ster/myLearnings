package com.rao.java.core.multiThreading;


// An incorrect implementation of a producer and consumer.
class QQ {
    int n;
    synchronized int get() {
        System.out.println("Got: " + n);
        return n;
    }
    synchronized void put(int n) {
        this.n = n;
        System.out.println("Put: " + n);
    } }
class Producer1 implements Runnable {
    QQ q;
    Producer1(QQ q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }
}
class Consumer1 implements Runnable {
    QQ q;
    Consumer1(QQ q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while(true) {
            q.get();
        }
    }
}
class WithOutThreadCommunication {
    public static void main(String args[]) {
        QQ q = new QQ();
        new Producer1(q);
        new Consumer1(q);
        System.out.println("Press Control-C to stop.");  //your fate to see this get printed !?
    }
}