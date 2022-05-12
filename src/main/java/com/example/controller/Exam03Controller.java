package com.example.controller;

import javax.servlet.ServletContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Ex03Form;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@ModelAttribute
	public Ex03Form setUpForm() {
		return new Ex03Form();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("input")
	public String input(Ex03Form ex03Form) {
		Integer name1=Integer.parseInt(ex03Form.getName1());
		Integer name2=Integer.parseInt(ex03Form.getName2());
		Integer name3=Integer.parseInt(ex03Form.getName3());
		
		Integer result=name1+name2+name3;
		Integer result1=(int) ((name1+name2+name3)*1.1);
		application.setAttribute("name1", name1);
		application.setAttribute("name2", name2);
		application.setAttribute("name3", name3);
		application.setAttribute("result", String.format("%,d",result));
		application.setAttribute("result2",String.format("%,d",result1));
		return "exam03-result";
	}
	

}
