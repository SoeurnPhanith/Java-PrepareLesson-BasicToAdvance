package org.example.collections.list;

public class Students {

    public int id;
    public String name;
    public int age;

    public Students(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void show() {
        System.out.println(id + " | " + name + " | " + age);
    }
}
