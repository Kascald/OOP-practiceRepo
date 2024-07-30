package com.password;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


class UserTests {


	@DisplayName("패스워드 랜덤생성기 초기화 여부 테스트")
	@Test
	void passwordCheck() {
		//given
		User user = new User();

		//when
		user.initPassword();

		//then
		assertThat(user.getPassword()).isNotNull();
	}

}