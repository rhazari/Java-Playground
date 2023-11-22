package com.raihan.Threads;

public class DeadlockEx {
    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public static void main(String[] args){
        Thread cook1 = new Thread(() -> {
            synchronized (spoon){
                System.out.println("Cook1 is holding spoon ...");
                System.out.println("Waiting for bowl ...");

                synchronized (bowl) {
                    System.out.println("Cool1 is holding spoon and bowl ...");
                }
            }
        });

        Thread cook2 = new Thread(() -> {
            synchronized (spoon){
                System.out.println("Cook2 is holding spoon ...");
                System.out.println("Waiting for bowl ...");

                synchronized (bowl) {
                    System.out.println("Cook2 is holding spoon and bowl ...");
                }
            }
        });

        cook1.start();
        cook2.start();
    }
}
