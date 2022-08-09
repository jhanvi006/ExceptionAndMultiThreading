package com.oracle.exceptions;

import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your first number");
            int x = Integer.parseInt(sc.nextLine());
            System.out.println("Enter your second number");
            int y = Integer.parseInt(sc.nextLine());
            int z = x / y;
            System.out.println("z = " +z);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("A number cannot be divided by 0, Illegal operation in Java");
            System.out.println("Exception thrown: " +ae);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Invalid data types are entered, number must be an integer.");
            System.out.println("Exception thrown: " +nfe);
        }
        catch(RuntimeException re)
        {
            System.out.println("Exception thrown: " +re);
        }
    }
}
