package com.password;

import com.password.gen.PasswordGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
	private static final Logger logger = LoggerFactory.getLogger(User.class);

	private String password;

	public void initPassword(PasswordGenerator passwordGenerator) {
		//as - is 방식 - 강한 결합도를 가진다
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

		//to - be 방식 - 약한 결합도를 가진다
		//String randomPassword = randomPasswordGenerator.generatePassword();
		String randomPassword = passwordGenerator.generatePassword();

		logger.info("User Password = {} | will change = {} , len = {}", this.password , randomPassword, randomPassword.length());

		if(randomPassword.length() >= 8 && randomPassword.length() <= 12) {
			this.password = randomPassword;
			logger.info("User Password Init Complete");
		}


	}

	public String getPassword() {
		return password;
	}
}
