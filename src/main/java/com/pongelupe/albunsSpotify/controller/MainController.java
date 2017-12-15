package com.pongelupe.albunsSpotify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pongelupe.albunsSpotify.model.User;
import com.pongelupe.albunsSpotify.repository.UserRepository;

@Controller
public class MainController {

	@Autowired
	private UserRepository repository;

	@GetMapping(value = "/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@PostMapping("/user")
	public ModelAndView user(RedirectAttributes redirectAttributes, @RequestParam("name") String name,
			@RequestParam("email") String email) {

		User user = repository.getLogin(email);
		if (user != null) {
			redirectAttributes.addFlashAttribute("name", name);
			return new ModelAndView("redirect:catalogo");
		} else
			return index();

	}

	@GetMapping(value = "/catalogo")
	public ModelAndView catalogo() {
		return new ModelAndView("catalogo");
	}

}
