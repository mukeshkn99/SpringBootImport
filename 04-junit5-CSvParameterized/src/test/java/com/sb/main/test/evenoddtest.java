package com.sb.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.sb.main.evenodd;

public class evenoddtest {
	
	@ParameterizedTest
	@CsvFileSource(resources="/data.csv",numLinesToSkip=1)
public void evenodd(String input,String expect) {
		System.out.println(input);
		evenodd eo=new evenodd();
		String result=eo.evenOrodd(Integer.parseInt(input));
		assertEquals(expect,result);
}
}
