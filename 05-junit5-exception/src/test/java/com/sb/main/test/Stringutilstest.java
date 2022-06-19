package com.sb.main.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.sb.main.Stringutils;

public class Stringutilstest {
	@Test
public void testconverttoint() {
	String st=null;
	
	assertThrows(IllegalArgumentException.class,()->Stringutils.converttoint(st));
}
}
