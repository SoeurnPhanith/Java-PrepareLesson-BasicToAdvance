package org.example.abtraction.interfacess;

public interface Payment {
    public abstract void payment(double amount);
    void refund(double amount);
    String getPaymentName();
    public static final double money = 1000;
}

//using implement if (class --->> interface)
class ABA implements Payment, BankFlow{

    private double balance = 5000;

    @Override
    public void payment(double amount) {
        System.out.println("Payment $ " + amount + " using ABA Pay");
        balance -= amount;
    }

    @Override
    public void refund(double amount) { //song luy
        System.out.println("Refunding $" + amount + " back to ABA account");
        balance -= amount;
    }

    @Override
    public String getPaymentName() {
        return "ABA Mobile Banking";
    }

    public double checkBalance(){
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("You deposit moeny $" + amount);
    }
}

//if interface to interface using extends
interface MiniPayment extends Payment {

}

class MainInterface{
    public static void main(String[] args) {

        ABA aba = new ABA();

        aba.deposit(2000);
        System.out.println("Right now your money in balance in :" + aba.checkBalance());

        aba.payment(500);
        System.out.println("Right now your money in balance in :" + aba.checkBalance());

        aba.refund(250);
        System.out.println("Right now your money in balance  = " + aba.checkBalance());


    }
}

/*
    1. What different of abstract class & interface :

    1. Syntax

    2. abstract class using keyword extend to override method from abstract class &
       interface using keyword implement to override method from interface

    3. In interface can not store normal data member (constraìnt member) & abstract class can store
       Normal data member.

    4. abstract class using single inheritance but interface can accept us to use multiple inheritance

    5. in interface not accept us to use constructor

    6. in interface can use only accessing modifier (public) and public as default

    7. public static final accessing is default

    8. in abstract class using keyword abstract to make abstract method but in interface no need
       keyword abstract to make abstract method


*/