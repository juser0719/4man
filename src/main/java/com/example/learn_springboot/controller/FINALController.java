package com.example.learn_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FINALController {
	@RequestMapping(value = {"/final/home"})
	public void actionhome() {
	}
	@RequestMapping(value = {"/final/SignIn"})
	public void actionSignIn() {
	}
	@RequestMapping(value = {"/final/SignUp"})
	public void actionSignUp() {
	}
}