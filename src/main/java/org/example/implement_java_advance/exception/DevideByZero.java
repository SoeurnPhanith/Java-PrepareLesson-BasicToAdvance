package org.example.implement_java_advance.exception;

import java.util.Scanner;

public class DevideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Enter value a : ");
            int a = scanner.nextInt();

            System.out.print("Enter value b : ");
            int b = scanner.nextInt();
            int result = a / b; // បង្កើត ArithmeticException

            System.out.println("Result of division =" + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
