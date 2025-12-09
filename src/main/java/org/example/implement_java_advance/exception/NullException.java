package org.example.implement_java_advance.exception;

public class NullException {
    public static void main(String[] args) {

        String str = null;
        try {
            System.out.println(str.length()); // str is null
            System.out.println("My string = " + str);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

    }
}
