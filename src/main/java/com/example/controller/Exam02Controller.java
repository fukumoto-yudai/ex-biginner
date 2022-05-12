package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Ex02Form;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {
	
	@Autowired
	private HttpSession session;
	
	@ModelAttribute
	public Ex02Form setUpForm() {
		return new Ex02Form();
	}
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/input")
	public String input(Ex02Form ex02Form) {
		Integer num1=Integer.parseInt(ex02Form.getNum1());
		Integer num2=Integer.parseInt(ex02Form.getNum2());
		Integer result=num1+num2;
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("result",result);
		return "exam02-result";
	}
	
	@RequestMapping("/result2")
	public String result2() {
		return "exam02-result02";
	}
	
	}
	


