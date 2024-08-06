package com.gradeCalculator;

import java.util.List;

public class Courses {
	private final List<Course> courses;

	public Courses(List<Course> courses) {
		this.courses = courses;
	}

	public double multiplyCreditsAndCoursesGrade() {
//		double multipliedCreditAndCourseGrade = 0;
//		for (Course course: courses) {
//			//multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNum();
//			multipliedCreditAndCourseGrade += course.multipleGradeAndCredits();
//		}
//		return multipliedCreditAndCourseGrade;
		return courses.stream()
				.mapToDouble(Course::multipleGradeAndCredits)
				.sum();
	}

	public int sumCompletedCredits() {
		return courses.stream()
				.mapToInt(Course::getCredit)
				.sum();
	}
}
