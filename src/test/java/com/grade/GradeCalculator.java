package com.grade;

import java.util.List;

public class GradeCalculator {
	private final List<Course> courses;

	public GradeCalculator(List<Course> courses) {
		this.courses = courses;
	}

	public double calculateGrade() {
		double multipliedCreditAndCourseGrade = 0;
		for (Course course: courses) {
//			multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNum();
			multipliedCreditAndCourseGrade += course.multipleGradeAndCredits();

		}

		int countCompletedCredits = courses.stream()
				.mapToInt(Course::getCredit)
				.sum();

		return multipliedCreditAndCourseGrade /countCompletedCredits;
	}
}
