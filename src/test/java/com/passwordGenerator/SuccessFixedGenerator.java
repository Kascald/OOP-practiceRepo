package com.passwordGenerator;

import com.passwordGenerator.gen.PasswordGenerator;

public class SuccessFixedGenerator implements PasswordGenerator {
	@Override
	public String generatePassword() {
		return "abcdefgh"; //length() = 8
	}
}
