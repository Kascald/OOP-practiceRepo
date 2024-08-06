package com.gradeCalculator;

import java.util.List;

public class GradeCalculator {
	private final Courses courses;


	public GradeCalculator(List<Course> courses) {
		this.courses = new Courses(courses);
	}

	public GradeCalculator(Courses courses) {
		this.courses = courses;
	}


	public double calculateGrade() {

		double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditsAndCoursesGrade();

		int countCompletedCredits  = courses.sumCompletedCredits();

		return totalMultipliedCreditAndCourseGrade /countCompletedCredits;
	}
}
