package com.calculatorPractice.operators;

import com.calculatorPractice.NewArithmeticInterface;

public class SubOperator implements NewArithmeticInterface {
	@Override
	public boolean supports(String operator) {
		return "-".equals(operator);
	}

	@Override
	public int calculate(PositiveValidation operand1, PositiveValidation operand2) {
		return operand1.toInt() - operand2.toInt();
	}
}
