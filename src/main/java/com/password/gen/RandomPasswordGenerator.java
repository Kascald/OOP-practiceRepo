package com.password.gen;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class RandomPasswordGenerator implements com.password.gen.PasswordGenerator {
	public static final String ALLOWED_SPL_CHARACTERS = "!@#$%^&*()_+";

	public static final String ERROR_CODE = "특수문자 오류 발생";

	public String generatePassword() {
		PasswordGenerator gen = new PasswordGenerator();

		CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
		CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
		lowerCaseRule.setNumberOfCharacters(2);

		CharacterData upperCaseChars = EnglishCharacterData.LowerCase;
		CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
		upperCaseRule.setNumberOfCharacters(2);

		CharacterData digitChar = EnglishCharacterData.LowerCase;
		CharacterRule digitRule = new CharacterRule(digitChar);
		digitRule.setNumberOfCharacters(2);

		CharacterData specialChar = new CharacterData() {
			@Override
			public String getErrorCode() {
				return ERROR_CODE;
			}
			@Override
			public String getCharacters() {
				return ALLOWED_SPL_CHARACTERS;
			}
		};
		CharacterRule splCharRule = new CharacterRule(specialChar);
		splCharRule.setNumberOfCharacters(2);

		//0~12
		return gen.generatePassword((int) (Math.random() * 13), splCharRule, lowerCaseRule , upperCaseRule , digitRule);
	}
}
