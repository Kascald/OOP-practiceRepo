package com.passwordGenerator.scenario;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedTestPractice {
	private static final Logger logger = LoggerFactory.getLogger(ParameterizedTestPractice.class);


	public static void idLenValidate(JoinRequest joinRequest) {
		if(joinRequest == null)
			throw new IllegalArgumentException("Argument가 null 입니다.");

		String id = joinRequest.getUsername().split("@")[0];
		logger.info("id = {} , id.length = {}" , id , id.length());

		if(id.length() < 5) {
			throw new IllegalArgumentException("아이디 길이는 5자 이상이어야 합니다.");
		}

	}

	public static void passwordlenValidate(JoinRequest joinRequest) {
		if(joinRequest == null)
			throw new IllegalArgumentException("Argument가 null 입니다.");

		String password = joinRequest.getPassword();
		logger.info("passwordGenerator = {} , length = {} !" , password , password.length());

		if (password.length() < 8)
			throw new IllegalArgumentException("사용자 비밀번호는 최소 8자 이상이어야 한다.");

	}

	public static void idExpValidate(String emailValue, boolean isValid) {
		if(emailValue == null)
			throw new IllegalArgumentException("Argument가 null 입니다.");

		String email = emailValue;
		String regExp = "^[0-9a-zA-Z._%+-]+@[0-9a-zA-Z.-]+\\.[a-zA-Z]{2,}$";

		String formattedLog = String.format("Email = %-25s, 이메일-정규식 예상결과= %-5s | 확인결과 = %-5s", email, isValid, email.matches(regExp));
		logger.info("{}", formattedLog);

		if(!email.matches(regExp))
			throw new IllegalArgumentException("아이디는 올바른 이메일 형식으로 입력하세요.");
	}
}
