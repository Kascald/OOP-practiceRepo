package com.calculatorPractice.operators;

import com.calculatorPractice.NewArithmeticInterface;

public class AddOperator implements NewArithmeticInterface {
	@Override
	public boolean supports(String operator) {
		return "+".equals(operator);
//		return operator.equals("+"); 로 작성하는 경우 NullPointException의 위험이 있다.
	}

	@Override
	public int calculate(PositiveValidation operand1, PositiveValidation operand2) {
		return operand1.toInt() + operand2.toInt();
	}
}
