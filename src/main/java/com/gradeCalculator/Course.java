package com.gradeCalculator;

public class Course {
	private final String subject;
	private final int credits;
	private final String grade;

	public Course(String subject, int credits, String grade) {
		this.subject = subject;
		this.credits = credits;
		this.grade = grade;
	}

	public double getGradeToNum() {
		double grade = 0;
		switch (this.grade) {
			case "A+":
				grade = 4.5;
				break;
			case "A":
				grade = 4.0;
				break;
			case "B+":
				grade = 3.5;
				break;
			case "B":
				grade = 3.0;
				break;
			case "C+":
				grade = 2.5;
				break;
			case "C":
				grade = 2.0;
				break;

		}
		return grade;
	}

	public double multipleGradeAndCredits() {
		return credits * getGradeToNum();
	}

	public int getCredit() {
		return credits;
	}
}
