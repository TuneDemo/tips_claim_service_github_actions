package com.tips.claim.stub.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

public class NonComplianceController {

	@Controller
	@SessionAttributes("hello")  // Noncompliant; this doesn't get cleaned up
	public class HelloWorld {

	  @RequestMapping(name = "/greet", method = RequestMethod.GET)
	  public String greet(String greetee) {

	    return "Hello " + greetee;
	  }
	}	
	
}
