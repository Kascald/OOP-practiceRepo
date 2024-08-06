package com.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {
	@Test
	@DisplayName("셰프가 요리를 만들었다!")
	void cookedByChief() {
		assertThatCode(()-> new Cook("만두", 5000))
				.doesNotThrowAnyException();
	}
}
