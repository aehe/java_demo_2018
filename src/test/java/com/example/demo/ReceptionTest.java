package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReceptionTest {

	@Test
	public void test() {
		
		Reception reception = new Reception();
		String actualResult = reception.get("Ally");
		assertEquals("Hello Ally", actualResult);
		
		fail("Not yet implemented");
		
	}
	
	@Test
	public void test2() {
		
		Reception reception = new Reception();
		String actualResult = reception.get("Tum");
		assertEquals("Hello Tum", actualResult);
		
		fail("Not yet implemented");
		
	}

}
