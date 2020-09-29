/*
    1. Enter three numbers. Find out how many of them are odd.
    2. Enter the number of the day of the week. Display the name in three languages.
    3. Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
    4. Create class Product with fields name, price and quantity.
        • Create four instances of type Product.
        • Display the name and quantity of the most expensive item.
        • Display the name of the items, which has the biggest quantity.
*/

package com.nazarenko.lesson.lesson_4.task1;

public class Product {
    private String name;
    private int price;
    private int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    private int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    static void displayMostExpensive(Product product1, Product product2, Product product3){
        int answer = Math.max(product1.getPrice(), product2.getPrice());
        answer = Math.max(answer, product3.getPrice());
        if(answer == product1.getPrice()) {
            System.out.println("Name of the most expensive product is: " + product1.getName() + ". Quantity of it is " + product1.getQuantity() + " unit(s).");
        }else if(answer == product2.getPrice()) {
            System.out.println("Name of the most expensive product is: " + product2.getName() + ". Quantity of it is " + product2.getQuantity() + " unit(s).");
        }else if(answer == product3.getPrice()) {
            System.out.println("Name of the most expensive product is: " + product3.getName() + ". Quantity of it is " + product3.getQuantity() + " unit(s).");
        }
    }

    static void displayMostQuantity(Product product1, Product product2, Product product3) {
        int answer = Math.min(product1.getQuantity(), product2.getQuantity());
        answer = Math.min(answer, product3.getQuantity());
        if(answer == product1.getQuantity()) {
            System.out.println("Name of the products with most quantities are: " + product2.getName() + " and " + product3.getName() + ".");
        }else if(answer == product2.getQuantity()) {
            System.out.println("Name of the products with most quantities are: " + product1.getName() + " and " + product3.getName() + ".");
        }else if(answer == product3.getQuantity()) {
            System.out.println("Name of the products with most quantities are: " + product1.getName() + " and " + product2.getName() + ".");
        }
    }

    static Product createProduct1(){
        return new Product("iPhone", 100500, 10);
    }
    static Product createProduct2(){
        return new Product("Samsung", 1050, 1000);
    }
    static Product createProduct3(){
        return new Product("Xiaomi", 15, 100000);
    }


    static void displayProductsInfo(){
        Product p1 = createProduct1();
        Product p2 = createProduct2();
        Product p3 = createProduct3();
        displayMostExpensive(p1, p2, p3);
        displayMostQuantity(p1, p2, p3);
    }
}
