package com.example.demo;

import java.util.Objects;

//POJO (Plan old java object)
//Geeter/Setter
public class Book {
    //Variable
    //Static variable
//    private static final String QTY="";
//    final int a; //immutable
    //Non-static
    private String name;
    private double price;
    private int stock;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 &&
                stock == book.stock &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, price, stock);
    }

    //Constructor
    public Book(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //public Method
    //private Method
    public static Book createHarryPotterOne(int stock) {
        return new Book("H1",8, stock);
    }

    public static Book createHarryPotterOne() {
        return new Book("H1",8, 1);
    }

    public static Book createHarryPotterTwo() {
        return new Book("H1",8, 2);
    }
}
