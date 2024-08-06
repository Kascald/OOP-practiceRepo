package com.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;


public class MenuTests {
	@Test
	@DisplayName("매뉴판의 메뉴중에서 메뉴이름에 해당하는 메뉴 반환테스트")
	void menuSelectTest() {
		Menu menu = new Menu(List.of(new MenuItem("돈까쓰", 6000), new MenuItem("쫄면" , 8000)));

		MenuItem menuItem  = menu.selectMenu("쫄면");

		assertThat(menuItem).isEqualTo( new MenuItem("쫄면" , 8000));
	}

	@Test
	@DisplayName("메뉴판에 없는 메뉴를 선택했을 경우의 메뉴 반환테스트")
	void nullMenuSelectTest() {
		Menu menu = new Menu(List.of(new MenuItem("돈까쓰", 6000), new MenuItem("쫄면" , 8000)));

		assertThatCode(()-> menu.selectMenu("치킨"))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("잘못된 메뉴이름 입니다.");
	}
}
