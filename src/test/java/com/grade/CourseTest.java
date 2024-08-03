package com.grade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {
	@Test
	@DisplayName("과목 생성 테스트")
	void Course() {
		assertThatCode(() -> new Course("OOP", 3 , "A+"))
				.doesNotThrowAnyException();
	}
}
