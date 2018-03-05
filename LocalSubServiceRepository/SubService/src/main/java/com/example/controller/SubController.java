package com.example.controller;

import org.springframework.http.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class SubController {
	
	@RequestMapping(value = "/{num1}/{num2}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String sub (@PathVariable int num1,
				       @PathVariable int num2)
	{
		return Integer.toString(num1 - num2);
	}

}
