package com.Revision.SecurityDB.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class HomeController {
@GetMapping("/index")
public String index() {
	return "index";
}
@GetMapping("/about")
public String about() {
	return "about";
}
@GetMapping("/profile")
public String profile() {
	return "profile";
}
}
