package com.sb.main;

public class Stringutils {
public static Integer converttoint(String str) {
	if(str==null||str.trim().length()==0) {
		throw new IllegalArgumentException("something went wrong");
	}
	else {
		return Integer.valueOf(str);
	}
}
}
