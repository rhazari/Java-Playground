package com.raihan.Threads;

class RunnableEx implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while(i <= 100){
            System.out.println(i + " " + Thread.currentThread().getName());
            ++i;
        }
    }
}

public class RunnableExample {
    public static void main(String[] args){
        Thread th1 = new Thread(new RunnableEx());
        th1.setName("First Thread");
        th1.start();

        Thread th2 = new Thread(() -> {
            int i = 0;
            while(i <= 100){
                System.out.println(i + " " + Thread.currentThread().getName());
                ++i;
            }
        });
        th2.setName("Second Thread");
        th2.start();
    }
}
