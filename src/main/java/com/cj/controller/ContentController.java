package com.cj.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/content/")
public class ContentController {
	
	@RequestMapping("company.do")		//http://localhost:8092/sample/main
	public String sample(Locale locale, Model model) throws Exception {
		return "content/company";
	}
	
	@RequestMapping("product.do")		//http://localhost:8092/sample/main
	public String sample2(Locale locale, Model model) throws Exception {
		return "content/product";
	}

}
