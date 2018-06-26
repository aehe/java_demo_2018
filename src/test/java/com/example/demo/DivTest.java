package com.example.demo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class DivTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void shouldThrowException3(){
        Div div = new Div();
        expected.expect(ArithmeticException.class);
        div.process(1,0);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowException2(){
        Div div = new Div();
        div.process(1,0);
    }

    @Test
    public void shouldThrowDivideByZeroException(){
        Div div = new Div();

        try {
            div.process(1, 0);
            fail("Should not be here");
        } catch (ArithmeticException e){

        }
    }
}