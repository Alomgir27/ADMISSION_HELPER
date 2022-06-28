package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @RequestMapping({"/home", "/", "/index"})
	public String getHomePage() {
		return "/index.html";
	}
	@RequestMapping("/login")
	public String getLoginPage() {
		return "/login.html";
	}
	@RequestMapping("/footer")
	public String getFooterPage() {
		return "/footer.html";
	}
	@RequestMapping("/dashboard")
	public String getDashBoardPage() {
		return "/dashboard.html";
	}
	@RequestMapping("/landing")
	public String getLandingPage() {
		return "/landing.html";
	}
	@RequestMapping("/profile")
	public String getProfilePage() {
		return "/profile.html";
	}
	@RequestMapping("/register")
	public String getRegisterPage() {
		return "/register.html";
	}

	@RequestMapping("/error")
	@ResponseBody
	public String getErrorPath() {
		return "<center><h1>Something went wrong</h1></center>";
	}
	
}
