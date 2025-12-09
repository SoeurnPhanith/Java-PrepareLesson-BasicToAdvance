package org.example.implement_java_advance.exception;

public class ArrayException {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]); // index 5 មិនមាន
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        finally {
            System.out.println("exception is stopped");
        }
    }
}
