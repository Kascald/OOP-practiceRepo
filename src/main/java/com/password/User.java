package com.password;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
	private static final Logger logger = LoggerFactory.getLogger(User.class);

	private String password;

	public void initPassword() {
		RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
		String randomPassword = randomPasswordGenerator.generatePassword();

		logger.info("User Password = {}", this.password);

		if(randomPassword.length() >= 8 && randomPassword.length() <= 12) {
			this.password = randomPassword;
			logger.info("User Password Init Complete");
		}


	}

	public String getPassword() {
		return password;
	}
}
