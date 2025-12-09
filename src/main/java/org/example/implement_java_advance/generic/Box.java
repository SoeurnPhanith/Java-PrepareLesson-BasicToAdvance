package org.example.implement_java_advance.generic;

public class Box <T> {
    //single member
    private T content;

    //method
    public void setContent(T content){
        this.content = content;
    }

    public T getContent(){
        return this.content;
    }
}

class ProductCategory{
     int id;
     String name;

    // Constructor
    public ProductCategory(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Main{
    public static void main(String[] args) {

        // Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setContent(123);
        System.out.println("Integer Box contains: " + intBox.getContent());

        // Box for String
        Box<String> strBox = new Box<>();
        strBox.setContent("Hello Generics");
        System.out.println("String Box contains: " + strBox.getContent());

        // Box for ProductCategory
        Box<ProductCategory> categoryBox = new Box<>();
        categoryBox.setContent(new ProductCategory(1, "drink"));
        System.out.println("Category Box contains: " + categoryBox.getContent());
    }
}

