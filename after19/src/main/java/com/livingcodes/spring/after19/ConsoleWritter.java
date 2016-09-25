package com.livingcodes.spring.after19;

public class ConsoleWritter implements LogWritter {

	public void write(String text) {
		System.out.println("From console : "+text);
	}

}
