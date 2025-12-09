package org.example.implement_java_advance.exception;

public class CustomAgeException extends RuntimeException {
    public CustomAgeException(String message) {
        super(message);
    }
}

class MainException{
    public static void validateAge(Integer age) throws CustomNameException{
        if (age == null) {
            throw new CustomAgeException("Age cannot be null");
        } else if (age < 0) {
            throw new CustomAgeException("Age cannot be less than zero");
        } else if (age < 18) {
            throw new CustomAgeException("Age must be 18 or older");
        }
        System.out.println("My age = " + age);
    }

    public static void main(String[] args) {

        try{
            validateAge(15);
        }catch (CustomNameException exception){
            System.out.println("Catch Error : " + exception.getMessage());
        }

    }
}
