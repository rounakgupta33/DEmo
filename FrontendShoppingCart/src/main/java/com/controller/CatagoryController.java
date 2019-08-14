package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import daos.CategoryDao;

import model.Category;



@Controller
public class CatagoryController {
	
	@Autowired
	CategoryDao cd;
	
	@RequestMapping(value="/addcategory",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute Category cObj,ModelMap map) {
		
		
		
		boolean b=cd.addCategory(cObj);
		if(b) {
		return "viewcatoption";
		}
		else
		return "getformjsp";
	}
	
	
	@RequestMapping(value="/viewcategory",method=RequestMethod.GET)
	public String viewCategory(ModelMap map) {
		
	
		List<Category> cList=cd.getAllCategory();
		map.addAttribute("cList", cList);
		return "viewall";
		
		
	}
	
	
	@RequestMapping(value="/delete/{cId}",method=RequestMethod.GET)
	public String deleteCategory(@PathVariable int cId,ModelMap  map) {
		
		cd.deleteCategory(cId);
		List<Category> cList=cd.getAllCategory();
		map.addAttribute("cList", cList);
		return "viewall";
		
		
	}
	
}
