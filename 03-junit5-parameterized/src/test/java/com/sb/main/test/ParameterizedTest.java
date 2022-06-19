package com.sb.main.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.provider.ValueSource;
import com.sb.main.Parameterized;

public class ParameterizedTest {

	
	@ParameterTest
	@ValueSource(strings= {"liril","radar","mukesh"})
	public void testPalindrome(String str) {
		Parameterized p=new Parameterized();
		Boolean result=p.palindromecheck(str);
		assertTrue(result);
	}
}
