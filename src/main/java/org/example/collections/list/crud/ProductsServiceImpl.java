package org.example.collections.list.crud;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductsServiceImpl implements ProductsService {

    private ArrayList<Products> productsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addProducts() {
        System.out.print("Enter product id : ");

    }

    @Override
    public void viewsProducts() {

    }

    @Override
    public void findProductsById() {

    }

    @Override
    public void updateProducts() {

    }

    @Override
    public void deletesProducts() {

    }
}
