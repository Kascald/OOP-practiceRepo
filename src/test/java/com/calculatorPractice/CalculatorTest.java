package com.calculatorPractice;


import com.calculatorPractice.operators.PositiveValidation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class CalculatorTest {

	@DisplayName("덧셈연산 시행")
	@Test
	public void addTest() {
		int result  = Calculator.calculate(new PositiveValidation(1), "+", new PositiveValidation(2));

		assertThat(result).isEqualTo(3);
	}

	@DisplayName("사칙연산 시행")
	@ParameterizedTest
	@MethodSource("formulaAndResult")
	public void calcTest(PositiveValidation operand1 , String operator , PositiveValidation operand2, PositiveValidation expectedResult) {
		int calcResult  = Calculator.calculate(operand1, operator, operand2);

		assertThat(calcResult).isEqualTo(expectedResult);
	}

	private static Stream<Arguments> formulaAndResult() {
		return Stream.of(
				arguments(1, "+", 2, 3),
				arguments(1, "-", 2, -1),
				arguments(4, "*", 2, 8),
				arguments(4, "/", 2, 2)
		                );
	}


	@DisplayName("예외 처리")
	@Test
	void calcExceptionTest() {
//		Calculator.calculate(10 "/" ,0);

		assertThatCode(()-> Calculator.calculate(new PositiveValidation(10), "/",new PositiveValidation(0)))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("나누기 0 오류");
	}


	//	@DisplayName("뺄셈연산 시행")
//	@Test
//	public void subTest() {
//		int result  = Calculator.calculate(1, "-", 2);
//
//		assertThat(result).isEqualTo(-1);
//	}
}
