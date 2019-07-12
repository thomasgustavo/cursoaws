package br.com.cwi.cursoaws.controller;

import br.com.cwi.cursoaws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user")
	public String user(Model model) {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		model.addAttribute("loggedUser", authentication.getName());
		model.addAttribute("usersList", userRepository.findAll());

		return "user";
	}
}
