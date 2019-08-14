package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Category;


@Controller
public class GetForm {

		@RequestMapping(value="/getform",method=RequestMethod.GET)
		public String getForm(ModelMap map) {
			
			Category c=new Category();
			map.addAttribute("cObj", c);
			return "getformjsp";
			
			
		}
		
}
