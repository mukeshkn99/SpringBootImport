package com.example.demo.exception;

public class NoBookFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoBookFoundException(String msg) {
		super(msg);
	}

}
