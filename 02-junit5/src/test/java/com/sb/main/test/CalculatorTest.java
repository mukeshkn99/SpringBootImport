package com.sb.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.sb.main.Calculator;

public class CalculatorTest {
@Test
public void addTest() {
	Calculator calc=new Calculator();
	Integer actual=calc.add(10, 20);
	Integer expected=30;
	assertEquals(expected, actual);
}
}
