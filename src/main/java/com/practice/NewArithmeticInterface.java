package com.practice;

import com.practice.operators.PositiveValidation;

public interface NewArithmeticInterface {
	boolean supports(String operator);
	int calculate(PositiveValidation operand1, PositiveValidation operand2);
}
