package com.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CheifTests {
	@Test
	@DisplayName("조리 시작 요청하기")
	void createCheifTest() {
		Cheif cheif = new Cheif();
		MenuItem menuItem = new MenuItem("돈까쓰", 6000);

		Cook cook = cheif.startCook(menuItem);

		assertThat(cook).isEqualTo(new Cook("돈까쓰",6000));
	}
}
