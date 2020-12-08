package com.rest.api.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rest.api.models.Student;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String Home(){
		return "index.html";
	}
}
