package com.javatpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.service.HelloWorldService;

@RestController
public class HelloWorldController {
	@Autowired
	HelloWorldService hws;

	@RequestMapping("/")
	public String hello() {
		return hws.printHelloService();
	}
}
