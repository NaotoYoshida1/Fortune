package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OmikujiController {

	@Autowired
	HttpSession session;

	@RequestMapping("/")
	public String index() {
		session.invalidate();
		return "omikuji";
	}

	@RequestMapping(value = "/omikuji", method = RequestMethod.POST)
	public ModelAndView omikuji(
			@RequestParam("name") String name,
			ModelAndView mv) {

		Person p = new Person(name);
		mv.addObject("person", p);

		//おみくじ
		Fortune f = new Fortune();
		mv.addObject("fortune", f);

		return mv;

	}

}
