package ar.empanada.webapp.ringmyphone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.empanada.webapp.ringmyphone.auth.UserLoginForm;

@Controller
public class LoginController {

	@GetMapping("/")
	public ModelAndView login() {
		UserLoginForm loginForm = UserLoginForm.of();
		return new ModelAndView("login", "form", loginForm);
	}
}
