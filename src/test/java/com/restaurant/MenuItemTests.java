package com.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThatCode;


class MenuItemTests {

	@Test
	@DisplayName("메뉴항목을 생성한다.")
	void menuCreateTest() {
		assertThatCode(()-> new MenuItem("만두", 5000))
				.doesNotThrowAnyException();
	}
}