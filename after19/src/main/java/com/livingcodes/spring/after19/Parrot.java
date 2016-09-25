package com.livingcodes.spring.after19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
	private String id;
	private String speech;

	public void speak() {
		System.out.println(id + ": " + speech);
	}

	@Autowired
	public void setId(@Value("#{randomSpeech.getTexts()?.length()}") String id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("#{T(Math).sin(T(Math).PI/4)^2 le 1? 'Yes':'No'}") String speech) {
		this.speech = speech;
	}
}
