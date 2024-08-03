package com.grade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GradeCalculatorTest {
	//학점계산기 필요한 것. 이수과목 , 받은 학점 , 계산 클래스

	@Test
	@DisplayName("학점 평균을 계산하기")
	void gradeCalcTest() {
		List<Course> courses = List.of (new Course("oop" ,3, "A+"),
		                                new Course("컴퓨터구조",3 ,"A+"));

		GradeCalculator gradeCalculator = new GradeCalculator(courses);
		double gradeResult = gradeCalculator.calculateGrade();

		assertThat(gradeResult).isEqualTo(4.5);
	}
}
