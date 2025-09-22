package com.example;

public class App {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello, CI/CD Pipeline! (Running...)");
            try {
                Thread.sleep(5000); // Print every 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getGreeting() {
        return "Hello, CI/CD Pipeline! (Running...)";
    }
}