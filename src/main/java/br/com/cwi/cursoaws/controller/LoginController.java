package br.com.cwi.cursoaws.controller;

import br.com.cwi.cursoaws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/")
	public String homePage(Model model) {
		return "login";
	}
}
