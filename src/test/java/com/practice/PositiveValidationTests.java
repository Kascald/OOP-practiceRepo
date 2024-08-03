package com.practice;

import com.practice.operators.PositiveValidation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PositiveValidationTests {

//	@Test
	@ParameterizedTest
	@ValueSource(ints = { 0 , -1})
	void constructTest(int value) {
		assertThatCode(()-> new PositiveValidation(value))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("0 또는 음수를 전달하려고 합니다.");
	}
}
