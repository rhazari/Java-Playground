package com.raihan.Threads;

class ThreadEx extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i < 100){
            System.out.println(i + " " + this.getName());
            ++i;
        }
    }
}

public class ThreadExample {
    public static void main(String[] args){
        ThreadEx th1 = new ThreadEx();
        th1.setName("First thread");
        th1.start();

        ThreadEx th2 = new ThreadEx();
        th2.setName("Second thread");
        th2.start();
    }
}
