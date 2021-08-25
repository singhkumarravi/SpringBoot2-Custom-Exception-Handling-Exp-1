package com.olive.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.olive.exception.NotImplentedException;
import com.olive.exception.UserNotFoundException;

@Controller
public class EmpController {

	@RequestMapping("/showa")
	public String showA(Model model) {
		if(new Random().nextInt(10)<=10) {
			throw new RuntimeException("Sample");
		}
		return "Home";
	}
	
	@RequestMapping("/showb")
	public String showB(Model model) {
		if(new Random().nextInt(10)<=10) {
			throw new NotImplentedException("Sample");
		}
		return "Home";
	}
	
	@RequestMapping("/showc")
	public String showC(Model model) {
		if(new Random().nextInt(10)<=10) {
			throw new UserNotFoundException("Sample");
		}
		return "Home";
	}
	
	
}
