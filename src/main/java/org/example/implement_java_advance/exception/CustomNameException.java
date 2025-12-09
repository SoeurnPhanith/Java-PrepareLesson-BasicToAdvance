package org.example.implement_java_advance.exception;

public class CustomNameException extends Exception{
    //constructor
    public CustomNameException(String message) {
        super(message);
    }
}

 class Main {
    public static void validateName(String name) throws CustomNameException {
        if (name == null || name.isEmpty()) {
            throw new CustomAgeException("Name cannot be empty");
        }
        System.out.println("Name is valid: " + name);
    }

    public static void main(String[] args) {
        try {
            validateName("");
        } catch (CustomNameException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}