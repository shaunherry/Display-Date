package com.shaun.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller


public class HomeController {
	
	
	
	
	@RequestMapping("/")
	public String index() {
		return "timedashboard.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("date", new Date());
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("time", new Date());
		return "time.jsp";
	}
	
	
}
