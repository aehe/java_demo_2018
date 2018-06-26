package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorizeTest {

    @Test
    public void input2_return2() {
        Factorize ft = new Factorize();
        String actualResult = ft.of(2);
        assertEquals("2", actualResult);
        
//        String expected = "2";
//        String actual = Factorize.answer(2);
        //assertEquals(expected, actual);
    }
    
    @Test
    public void input4_return4() {
        Factorize ft = new Factorize();
        String actualResult = ft.of(4);
        assertEquals("2,2", actualResult);
    }
}

