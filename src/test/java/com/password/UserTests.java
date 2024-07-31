package com.password;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


public class UserTests {

	@DisplayName("패스워드 랜덤생성기 초기화 여부 테스트 - 조건 일치로 초기화 되어야함")
	@Test
	void passwordCheck() {
		//given
		User user = new User();

		//when
		user.initPassword(new SuccessFixedGenerator());

		//user.initPassword(() -> "abcdefgh");

		//then
		assertThat(user.getPassword()).isNotNull();
	}

	@DisplayName("패스워드 랜덤생성기 초기화 여부 테스트 - 조건 불일치로 초기화 되지 않아야함")
	@Test
	void passwordFixedCheck() {
		//given
		User user = new User();

		//when
		user.initPassword(new WrongFixedGenerator());
		//user.initPassword(() -> "ab");

		//then
		assertThat(user.getPassword()).isNull();
	}

}