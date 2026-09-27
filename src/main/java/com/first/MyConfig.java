package com.first;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	
	@Bean
	public Object getObject() {
		return new Object();
	}
	
	@Bean
	public Exception getException() {
		return new Exception();
	}

}
