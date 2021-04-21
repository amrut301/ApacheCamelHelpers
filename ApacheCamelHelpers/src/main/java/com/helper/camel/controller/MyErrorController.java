package com.helper.camel.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author amrmalaj
 *
 */
@RestController
public class MyErrorController implements ErrorController {

	@RequestMapping("/error")
	public String handleError() {
		return "error Occured pelase try after sometime!!!";
	}

	
	@Override
	public String getErrorPath() {
		return "/error";
	}
}
