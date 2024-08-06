package com.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CustomerTests {

	@Test
	@DisplayName("메뉴 이름에 해당하는 요리를 주문하는 손님테스트")
	void orderTest() {
		Customer customer = new Customer();

		Menu menu = new Menu(List.of(new MenuItem("돈까쓰", 6000), new MenuItem("쫄면" , 8000)));
		Cheif cheif = new Cheif();

		assertThatCode(()-> customer.orderMenu("돈까쓰", menu , cheif))
				.doesNotThrowAnyException();

	}
}
