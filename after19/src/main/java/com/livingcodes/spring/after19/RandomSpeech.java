package com.livingcodes.spring.after19;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomSpeech {
	private static String[] texts = { "I'll be back", "Get out", "I your cloths,boots and motorcycle", "Test Null" };

	public String getTexts() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}
}
