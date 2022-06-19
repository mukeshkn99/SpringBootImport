package com.sb.main.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sb.main.Calculator;

public class CalculatorTest {

	
	private static Calculator calc =null;
	
	@BeforeClass
	public static void beforeAll() {
		calc=new Calculator();
	}
	
	@AfterClass
	public static void afterAll() {
		calc=null;
	}
	
	
	
	
	@Test
	public void addTest() {
		Integer actualResult=calc.add(10, 20);
		Integer expectedResult=30;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void multiplyTest() {
		Integer actualResult=calc.multiply(2, 3);
        Integer expectedResult=6;
        assertEquals(expectedResult,actualResult);
	}
}
