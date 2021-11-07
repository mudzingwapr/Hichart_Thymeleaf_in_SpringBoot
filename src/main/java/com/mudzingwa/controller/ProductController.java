package com.mudzingwa.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductController {
	
	@GetMapping("/BarChart")
	public String Bargraph(Model model) {
		Map<String,Integer> mapProdu = new  TreeMap<>();
		mapProdu.put("Java", 40);
		mapProdu.put("PHP", 30);
		mapProdu.put("C#", 15);
		mapProdu.put("Python", 20);
		mapProdu.put(".Net", 15);
		mapProdu.put("RuBy On Rail", 15);
		mapProdu.put("Julia", 20);
		mapProdu.put("C++", 15);
		model.addAttribute("mapProdu",mapProdu);
		return "BarGraphy";
	}
	@GetMapping("/PieChart")
	public String pieChart(Model model ) {
		model.addAttribute("Marondera", 20);
		model.addAttribute("Mutare", 60);
		model.addAttribute("Bulawayo", 25);
		model.addAttribute("Chivu", 33);
		return "Pichart";
	}
	

}
