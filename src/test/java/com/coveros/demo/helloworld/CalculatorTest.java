package com.coveros.demo.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testHelloWorld() {
		Calculator c = new Calculator();
		double result = c.sum(10,50);
		assertEquals(60, result, 0);
	}
}
