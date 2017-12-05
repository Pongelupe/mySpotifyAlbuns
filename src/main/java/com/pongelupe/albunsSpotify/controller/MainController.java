package com.pongelupe.albunsSpotify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pongelupe.albunsSpotify.model.User;
import com.pongelupe.albunsSpotify.repository.UserRepository;

@Controller
public class MainController {

	@Autowired
	private UserRepository repository;

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}

	@PostMapping("/user")
	public String catalogo(Model model, @RequestParam("name") String name, @RequestParam("email") String email) {
		User user = new User(name, email);

		repository.save(user);

		model.addAttribute("name", name);

		return "catalogo";

	}

}
