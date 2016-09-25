package com.livingcodes.spring.after19;

public class FileWritter implements LogWritter {

	public void write(String text) {
		System.out.println("From file : "+text);

	}

}
