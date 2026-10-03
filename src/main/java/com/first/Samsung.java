package com.first;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile{
	public void text() {
		System.out.println("Texting using Samsung");
	}
}
