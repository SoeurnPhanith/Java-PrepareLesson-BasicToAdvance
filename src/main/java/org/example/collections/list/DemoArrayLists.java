package org.example.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //add data to list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(70);
        list.add(5);
        list.add(100);
        list.add(2);

        //get all data normal
        System.out.println(list);

        //get data with index
        System.out.println(list.get(1));
        System.out.println(list.get(0));

        //get using lambda
        list.forEach(item -> System.out.println(item));

        //get using normal loop
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //search or find
        System.out.println(list.contains(20));
        System.out.println(list.contains(50));

        //find with first index(ber show -1 mean ney tha ot see)
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(6));

        //find on last index
        System.out.println(list.lastIndexOf(30));
        System.out.println(list.lastIndexOf(7));

        //remove with index and object
        list.remove(0);
        //after remove
        System.out.println(list);

        //sort
        Collections.sort(list);
        System.out.println(list);

        //reverse
        System.out.println(list.reversed());
    }
}
