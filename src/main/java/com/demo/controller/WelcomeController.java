package com.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Account;
import com.demo.service.AccountService;

@Controller
//@RequestMapping(value="/view")
public class WelcomeController {

	// inject via application.properties
	//@Value("${welcome.message:test}")
	//private String message = "Hello World";

	@Autowired
	AccountService accountService;

	@RequestMapping("/")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

	@RequestMapping("/welcome")
	public ModelAndView welcomePage() {
		return new ModelAndView("welcome");
	}

	//@RequestMapping(value = "/addNewEmployee", method = RequestMethod.GET)
	@RequestMapping(value = "/addNewAccount", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("addAccount", "acc", new Account());
	}

	@RequestMapping(value = "/addNewAccount", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("acc") Account acc) {
		
		accountService.insertAccount(acc);
		List<Account> accounts = accountService.getAllAccounts();
		ModelAndView model = new ModelAndView("getAccounts");
		model.addObject("accounts", accounts);
		return model;
	}

	@RequestMapping("/getAccounts")
	public ModelAndView getAccounts() {
		List<Account> accounts = accountService.getAllAccounts();
		ModelAndView model = new ModelAndView("getAccounts");
		model.addObject("accounts", accounts);
		return model;
	}

}
