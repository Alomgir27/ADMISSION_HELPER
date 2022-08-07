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
	@RequestMapping("/celandar")
	public String getCelandarPage() {
		return "/celandar.html";
	}
	@RequestMapping("/registration")
	public String getRegistrationPage() {
		return "/registration.html";
	}

}
