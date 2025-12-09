package org.example.abtraction.abtract_class;

abstract public class Animals {
    public abstract void sound();
    public abstract void eat();
}

class Dog extends Animals{

    @Override
    public void sound() {
        System.out.println("Vos Vos");
    }

    @Override
    public void eat() {
        System.out.println("Am am am ");
    }
}

class Cat extends Animals{

    @Override
    public void sound() {
        System.out.println("Moew Moew");
    }

    @Override
    public void eat() {
        System.out.println("Um Um Um");
    }
}

class Main{
    public static void main(String[] args) {
        Animals dog = new Dog();
        Animals cat = new Cat();

        dog.sound();
        dog.eat();

        cat.sound();
        cat.eat();
    }
}
