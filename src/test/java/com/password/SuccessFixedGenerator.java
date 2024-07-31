package com.password;

import com.password.gen.PasswordGenerator;

public class SuccessFixedGenerator implements PasswordGenerator {
	@Override
	public String generatePassword() {
		return "abcdefgh"; //length() = 8
	}
}
