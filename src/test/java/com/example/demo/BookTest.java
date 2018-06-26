package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void test(){
        Book book = Book.createHarryPotterOne(1);
    }

    @Test
    public void createBookWithConstructor(){
        Book book1 = new Book("H1",8,2);
        Book book2 = new Book("H1",8,2);
        assertEquals(book1,book2);
    }

    @Test
    public void createBookWithCreationMethod(){
        Book book1 = Book.createHarryPotterOne();
        Book book2 = Book.createHarryPotterTwo();
    }

    @Test
    public void createBookWithBuilderPattern(){
        Book book1 = new BookBuilder()
                .setPrice(8)
                .setName("H1")
                .build();

    }
}
