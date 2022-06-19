package com.sb.main;

public class Parameterized {

	public boolean palindromecheck(String str) {
		String reverse=" ";
		int length=str.length();
		for(int i=length-1;i>0;i--) {
			reverse=reverse+str.charAt(i);
		}
	
		if(str.equals(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		return false;
	}
}
