package com.example.demo.app.survey;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SurveyForm {

	@NotNull
	@Min(0)
	@Max(150)
	public int age;

	@NotNull
	@Min(1)
	@Max(5)
	public int satisfaction;

	@NotNull
	@Size(min = 1, max = 200, message = "Must be less than or equal to 200")
	public String comment;

	public SurveyForm() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
