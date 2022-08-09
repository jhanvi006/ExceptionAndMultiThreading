package com.oracle.multithreading;

class MultithreadingExample implements Runnable {
    public void run()
    {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
public class ExampleUsingInterface {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new MultithreadingExample());
            thread.start();
        }
    }
}
