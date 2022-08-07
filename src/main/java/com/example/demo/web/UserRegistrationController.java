package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;
import com.example.demo.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;
	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
		System.out.println("1");
	}
	
	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
		System.out.println("2");

        return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		System.out.println("3");

		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		System.out.println("4");

		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
}