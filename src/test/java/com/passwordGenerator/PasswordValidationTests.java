package com.passwordGenerator;
/*
 * 비밀번호 최소 8자 이상 12자 이하
 * 8자 미만 , 12자 초과 인 경우 IllegarlArgumentException 발생
 * 경계조건에 대해 테스트
 *
 * */

import com.passwordGenerator.gen.PasswordValidator;
import com.passwordGenerator.scenario.JoinRequest;
import com.passwordGenerator.scenario.ParameterizedTestPractice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidationTests {

	private static final String ERROR_MESSAGE = "Password의 길이가 유효하지 않습니다.";


	/*Step 1. 먼저 테스트 코드의 틀을 작성하고 실행시키면 당연히 실패한다. -> PasswordValidator 가 아직 작성되지 않았기 때문 */
	@DisplayName("비밀번호 최소 8자 이상 12자 이하")
	@Test
	void validationPasswordTest() {
		assertThatCode(() -> PasswordValidator.validate("mypassword"))
				.doesNotThrowAnyException();
	}
	/*Step 2. 클래스 PasswordValidator를 프로덕션 코드쪽에 생성하고 validate() 메서드를 생성해준다. */


	@DisplayName("비밀번호 8자 미만, 12자 초과")
	@Test
	void validationPasswordTest2() {
		assertThatCode(() -> PasswordValidator.validate("aabb"))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage(ERROR_MESSAGE);
	}


	@DisplayName("비밀번호 8자 미만, 12자 초과 / 경계조건 테스트")
	@ParameterizedTest
	@ValueSource(strings = {"aabbccd", "aaaabbbbccccdef"})
		//	@Test
	void validationPasswordTestParameterized(String password) {
		assertThatCode(() -> PasswordValidator.validate(password))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage(ERROR_MESSAGE);
	}

	/*
	@ParameterizedTest
	@ValueSource
	연습 1.
	- 사용자 ID는 5자 이상이어야 한다.
	- 사용자 비밀번호는 최소 8자 이상이어야 한다.
	- 이메일 형식이 유효해야 한다.
	*/
	@DisplayName("ParameterizedTest,ValueSource 연습용 테스트- 1_ 회원가입(1)_사용자 ID는 5자 이상이어야 한다.")
	@ParameterizedTest
	@CsvSource({"kgh@test.com , password1234"})
	void joinIdLenTest(String username, String password) {
		JoinRequest joinRequest = new JoinRequest(username, password);

		assertThatCode(() -> ParameterizedTestPractice.idLenValidate(joinRequest))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("아이디 길이는 5자 이상이어야 합니다.");
	}

	@DisplayName("ParameterizedTest,ValueSource 연습용 테스트- 1_ 회원가입(2)_사용자 비밀번호는 최소 8자 이상이어야 한다.")
	@ParameterizedTest
	@CsvSource({"kghui20@test.com , passwor"})
	void joinPasswordLenTest(String username, String password) {
		JoinRequest joinRequest = new JoinRequest(username, password);

		assertThatCode(() -> ParameterizedTestPractice.passwordlenValidate(joinRequest))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("사용자 비밀번호는 최소 8자 이상이어야 한다.");
	}

	@DisplayName("ParameterizedTest,ValueSource 연습용 테스트- 1_ 회원가입(3)_이메일 형식이 유효해야 한다.")
	@ParameterizedTest
	@CsvSource({
			"myTest@test.com, true",
			"test@calculatorPractice.com, true",
			"invalid-email@, false",
			"user@domain.co, true",
			"user.name@domain.com, true",
			"user@sub.domain.com, true",
			"user@domain.c, false",
			"user@domain.comm, true"
	})
	void joinIdExpTest(String emailValue, boolean isValid) {
		if (isValid) {
			assertThatCode(() -> ParameterizedTestPractice.idExpValidate(emailValue,isValid))
					.doesNotThrowAnyException();
		} else {
			assertThatCode(() -> ParameterizedTestPractice.idExpValidate(emailValue,isValid))
					.isInstanceOf(IllegalArgumentException.class)
					.hasMessage("아이디는 올바른 이메일 형식으로 입력하세요.");
		}
	}
}
