package com.luanjun.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.luanjun.base.BaseController;

@Controller
public class TestController extends BaseController {

	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public ModelAndView test(@RequestParam(value = "a", required = false) String a) {
		ModelAndView mv = new ModelAndView();
		Map<String, Object> user = new HashMap<String, Object>();
		user.put("name", "Jack.LuJ");
		user.put("age", 26);
		
		List<String> list = new ArrayList<String>();
		list.add("Jack1");
		list.add("Jack2");
		list.add("Jack3");

		mv.addObject("list", list);
		mv.addObject("user", user);
		mv.addObject("param", a);
		mv.setViewName("may");
		return mv;
	}
	
	@RequestMapping(value = "admin/index.html", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value = "first.html", method = RequestMethod.GET)
	public ModelAndView first() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("first");
		return mv;
	}
}
