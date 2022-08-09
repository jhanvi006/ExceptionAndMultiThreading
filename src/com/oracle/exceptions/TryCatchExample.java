package com.oracle.exceptions;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your first number");
            int x = sc.nextInt();
            System.out.println("Enter your second number");
            int y = sc.nextInt();
            int z = x / y;
            System.out.println("z = " +z);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
    }
}
