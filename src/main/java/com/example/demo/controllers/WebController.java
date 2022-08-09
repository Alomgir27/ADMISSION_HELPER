package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


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
	@RequestMapping("/apply")
	public String getApplyPage() {
		return "/apply.html";
	}
	@RequestMapping("/apply/BUET")
	public String getApplyBuetPage() {
		return "/BuetApply.html";
	}
	@RequestMapping("/apply/Engineering")
	public String getApplyEngineeringPage() {
		return "/EngineeringApply.html";
	}
	@RequestMapping("/apply/DU")
	public String getApplyDuPage() {
		return "/apply.html";
	}
	@RequestMapping("/apply/RU")
	public String getApplyRuPage() {
		return "/EngineeringApply.html";
	}
	@RequestMapping("/apply/GST")
	public String getApplyGstPage() {
		return "/apply.html";
	}
	@RequestMapping("/apply/AG")
	public String getApplyAgPage() {
		return "/apply.html";
	}
	@RequestMapping("/apply/MBA")
	public String getApplyMbaPage() {
		return "/MbaApply.html";
	}
	@RequestMapping("/result")
	public String getResultPage() {
		return "/result.html";
	}
	@RequestMapping("/notice")
	public String getNoticePage() {
		return "/notice.html";
	}
	
}
