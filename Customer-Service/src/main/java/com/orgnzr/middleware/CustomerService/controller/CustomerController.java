package com.orgnzr.middleware.CustomerService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.orgnzr.middleware.CustomerService.service.showUser;

@RestController
public class CustomerController {
	
	private showUser showUsers;
	
	@RequestMapping(value="/showUser",method=RequestMethod.GET)
	public String showUser() {
		System.out.println("masuk show user");
		return showUsers.showAllUser();
	}
}