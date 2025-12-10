package org.example.collections.list.crud;

import org.example.utils.Colors;

public class Products {

    private int id;
    private String name;
    private double price;
    private int qty;

    //overloading constructor
    public Products(int id, String name, double price, int qty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public Products() {
        this.id = 0;
        this.name = "unknown";
        this.price = 0.0;
        this.qty = 0;
    }

    public double findTotal(){
        return price * qty;
    }

    public int findDiscount() {
        double total = findTotal();
        return (total > 3 && total < 10) ? 5 :
               (total > 15 && total < 30) ? 10 :
               (total > 35 && total < 45) ? 15 :
               (total > 45 && total < 60) ? 20 : 30;
    }

    public double findPayments(){
        double total = findTotal();
        int discount = findDiscount();

        return total - (total * discount)/ 100;
    }

    //setters
    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setPrice(double price){this.price = price;}
    public void setQty(int qty){this.qty = qty;}

    //getters
    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public double getPrice(){return this.price;}
    public int getQty(){return this.qty;}

    //Show header
    public void showHeader() {
        System.out.println(Colors.GREEN+"-------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-10s %-10s %-10s %-10s %-10s%n",
                "ID", "Name", "Price", "Qty", "Total", "Dis(%)", "Payment");
        System.out.println("-------------------------------------------------------------------------------------"+ Colors.RESET);
    }

    public void showData() {
        System.out.printf(Colors.YELLOW + "%-5d %-15s %-10.2f %-10d %-10.2f %-10d %-10.2f%n" + Colors.RESET,
                id,
                name,
                price,
                qty,
                findTotal(),
                findDiscount(),
                findPayments()
        );
    }


}
