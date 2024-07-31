package com.password;

import com.password.gen.PasswordGenerator;

public class WrongFixedGenerator implements PasswordGenerator {
	@Override
	public String generatePassword() {
		return "ab";
	}
}
