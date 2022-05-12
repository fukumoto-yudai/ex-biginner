package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class UserForm {
	@NotBlank(message="名前は入れてください")
	private String name;
	@NotEmpty(message="年齢は書いてください")
	private String age;
	@NotEmpty(message="コメントは書いてください")
	private String comment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}

}
