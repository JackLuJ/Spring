package com.luanjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.luanjun.base.BaseController;

@Controller
public class TestController extends BaseController {

	@RequestMapping(value="/test.do", method=RequestMethod.GET)
	public String test(@RequestParam("world") String world){
		return "Hello "+world;
	}
}
