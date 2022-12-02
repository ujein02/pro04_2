package com.cj.util;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//http://localhost:8092/check/
@Controller
@RequestMapping("/check/*")
public class CheckController {
		
	@RequestMapping(value="check1", method = RequestMethod.GET)
	public String getCheck1(HttpServletRequest request, Model model) throws Exception {
		return "check/check1";
	}
	
	//view(jsp)에서 input의 pattern과 required에 의한 검증
	@RequestMapping(value="check1", method = RequestMethod.POST)
	public String postCheck1(HttpServletRequest request, Model model) throws Exception {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "check/result1";	//${id}, ${pw}
	}
	
	@RequestMapping(value="check2", method = RequestMethod.GET)
	public String getCheck2(HttpServletRequest request, Model model) throws Exception {
		return "check/check2";
	}
	
	//view(jsp)에서 javascript에 의한 검증
	@RequestMapping(value="check2", method = RequestMethod.POST)
	public String postCheck2(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) throws Exception {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "check/result2";
	}
	
	@RequestMapping(value="check3", method = RequestMethod.GET)
	public String getCheck3(HttpServletRequest request, Model model) throws Exception {
		return "check/check3";
	}
	
	//view(jsp)에서 jQuery에 의한 검증
	@RequestMapping(value="check3.do", method = RequestMethod.GET)
	public String postCheck3(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) throws Exception {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "check/result3";
	}
	
	@RequestMapping(value="check4", method = RequestMethod.GET)
	public String getCheck4(Model model) throws Exception {
		return "check/check4";
	}
	
	//Validator에 의한 검증 
	@RequestMapping(value="check4", method = RequestMethod.POST)
	public String postCheck4(@ModelAttribute("member") Member member, Model model, BindingResult result) throws Exception {
		String page = "check/result4";
		MemberValidator userValidator = new MemberValidator();
		userValidator.validate(member, result);

		if(result.hasErrors()) {
			page = "check/error4";
		}
		return page;	
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    binder.setValidator(new MemberValidator());
	}
	
	@RequestMapping(value="check5", method = RequestMethod.GET)
	public String getCheck5(HttpServletRequest request, Model model) throws Exception {
		return "check/check5";
	}

	//Validator에 의한 검증(@Valid+@InitBinder) 
	@RequestMapping(value="check5", method = RequestMethod.POST)
	public String postCheck5(@ModelAttribute("member") @Valid Member member, Model model, BindingResult result) throws Exception {
		
	    String path = "check/result5";
	    if(result.hasErrors()) {
	        path = "check/error5";
	    }
	    return path;
	}
}