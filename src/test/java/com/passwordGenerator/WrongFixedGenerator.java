package com.passwordGenerator;

import com.passwordGenerator.gen.PasswordGenerator;

public class WrongFixedGenerator implements PasswordGenerator {
	@Override
	public String generatePassword() {
		return "ab";
	}
}
