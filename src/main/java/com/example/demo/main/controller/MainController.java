package com.example.demo.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.main.dao.MainMapper;

@Controller
public class MainController {

	@Autowired
	MainMapper mainMapper;
	@RequestMapping(value = "/main",method = RequestMethod.GET)
	public ModelAndView index() {
//		System.out.println(mainMapper.list());
//		return "index.jsp";
		
		System.out.println(mainMapper.list());
		ModelAndView mv = new ModelAndView("index2");
//		mv.addObject("main", mainMapper.list());
		return mv;
		
	}
}
