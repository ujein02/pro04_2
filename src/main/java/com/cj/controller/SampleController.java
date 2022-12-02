package com.cj.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cj.dto.MemberDTO;

//http://localhost:8092/sample/
@Controller
@RequestMapping("/sample/*")
public class SampleController {

	@RequestMapping("main")		//http://localhost:8092/sample/main
	public String sample(Locale locale, Model model) throws Exception {
		return "sample/main";
	}
	
	@GetMapping("get1")
	public String get1(HttpServletRequest request, Model model) throws Exception {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "sample/get1";
	}
	
	@RequestMapping(value="get2", method = RequestMethod.GET)
	public String get2(HttpServletRequest request, Model model) throws Exception {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "sample/get2";
	}
	
	//@RequestParam("필드명") 은 request.getParameter("필드명")을 대신하여 받아오므로 생략 가능 
	@RequestMapping(value="get3", method = RequestMethod.GET)
	public String get3(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) throws Exception {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "sample/get3";
	}
	//POST에서만 가능
	@RequestMapping(value="get4", method = RequestMethod.GET)
	public String get4(MemberDTO member, Model model) throws Exception {
		return "sample/get4";	//${member.id}, ${member.pw}
	}	
	@RequestMapping(value="get5", method = RequestMethod.GET)
	public String get5(@ModelAttribute("mem") MemberDTO member, Model model) throws Exception {
		return "sample/get5";	//${mem.id}, ${mem.pw}
	}
	//GET방식에서 주로 활용하며, spring이나 react에서만 전달 가능한 방식임
	@RequestMapping("get6/{id}/{pw}")
	public String get6(@PathVariable("id") String id,@PathVariable("pw") String pw, Model model) throws Exception {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "sample/get6";
	}
	
	@RequestMapping(value="get7", method = RequestMethod.GET)
	public ModelAndView get7(@RequestParam("id") String id, @RequestParam("pw") String pw, ModelAndView mav) throws Exception {
		mav.addObject("id", id);
		mav.addObject("pw", pw);
		mav.setViewName("sample/get7");
		return mav;
	}
	
	@PostMapping("post1")
	public String post1(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "sample/post1";
	}
	
	@RequestMapping(value="post2", method = RequestMethod.POST)
	public String post2(HttpServletRequest request, Model model) throws Exception {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "sample/post2";
	}
	
	//@RequestParam("필드명") 은 request.getParameter("필드명")을 대신하여 받아오므로 생략 가능 
	@RequestMapping(value="post3", method = RequestMethod.POST)
	public String post3(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) throws Exception {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "sample/post3";
	}
	//POST에서만 가능
	@RequestMapping(value="post4", method = RequestMethod.POST)
	public String post4(MemberDTO member, Model model) throws Exception {
		return "sample/post4";	//${member.id}, ${member.pw}
	}	
	@RequestMapping(value="post5", method = RequestMethod.POST)
	public String post5(@ModelAttribute("mem") MemberDTO member, Model model) throws Exception {
		return "sample/post5";	//${mem.id}, ${mem.pw}
	}
	//GET방식에서 주로 활용하며, spring에서만 전달 가능한 방식임
	@RequestMapping("post6/{id}/{pw}")
	public String post6(@PathVariable("id") String id,@PathVariable("pw") String pw, Model model) throws Exception {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "sample/post6";
	}
	
	@RequestMapping(value="post7", method = RequestMethod.POST)
	public ModelAndView post7(@RequestParam("id") String id, @RequestParam("pw") String pw, ModelAndView mav) throws Exception {
		mav.addObject("id", id);
		mav.addObject("pw", pw);
		mav.setViewName("sample/post7");
		return mav;
	}
}
