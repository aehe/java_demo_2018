package com.example.demo;

public class BookItem {

    private Book book;
    private int qty;

    public BookItem(Book book, int qty) {

        this.book = book;
        this.qty = qty;
    }

    public Book getBook() {
        return book;
    }

    public int getBookAmount() {
        return qty;
    }

    public double getTotalPrice() {
        return book.getPrice()*qty;
    }
}
