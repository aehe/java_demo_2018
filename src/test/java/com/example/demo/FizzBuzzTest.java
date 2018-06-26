package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testFB_1() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(1);
		assertEquals("1", actualResult);		
	}	
	
	@Test
	public void testFB_2() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(2);
		assertEquals("2", actualResult);		
	}	
	
	@Test
	public void testFB_3() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(3);
		assertEquals("Fizz", actualResult);		
	}
	
	@Test
	public void testFB_4() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(4);
		assertEquals("4", actualResult);		
	}
	
	@Test
	public void testFB_5() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(5);
		assertEquals("Buzz", actualResult);		
	}
	
	@Test
	public void testFB_6() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(6);
		assertEquals("Fizz", actualResult);		
	}
	
	@Test
	public void testFB_7() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(7);
		assertEquals("7", actualResult);		
	}
	
	@Test
	public void testFB_8() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(8);
		assertEquals("8", actualResult);		
	}
	
	@Test
	public void testFB_9() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(9);
		assertEquals("Fizz", actualResult);		
	}
	
	@Test
	public void testFB_10() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(10);
		assertEquals("Buzz", actualResult);		
	}
	
	@Test
	public void testFB_15() {		
		FizzBuzz fbz = new FizzBuzz();
		String actualResult = fbz.say(15);
		assertEquals("FizzBuzz", actualResult);		
	}
	

}
