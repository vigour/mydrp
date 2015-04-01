package com.keitsen.mvcproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keitsen.mvcproject.model.User;

@Controller
@RequestMapping("/")
public class UserController {

	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("login")
	public String login(User user, HttpServletRequest request, HttpServletResponse response){
		System.out.println(user.getUsername());
		return "success";
	}
}
