package com.passwordGenerator.gen;

public class PasswordValidator {

	private static final String ERROR_MESSAGE = "Password의 길이가 유효하지 않습니다.";

	public static void validate(String password) {
		int length = password.length();

		if(length < 8 || length > 12) {
			throw new IllegalArgumentException(ERROR_MESSAGE);
		}
	}

	/*Step 3. 생성된 메서드에 내용이 없어도 테스트는 통과하지만, 요구사항을 충족하는
	* 최소한의 코드를 작성한 후 테스트를 진행해보면
	* if(mypassword.length() < 8 || mypassword.length() > 12) {
			throw new IllegalArgumentException("Password의 길이가 유효하지 않습니다.");
		}
	*
	* 테스트가 통과한다. -> 리팩토링을 진행한다. ->테스트를 진행한다.
	*  */
}
