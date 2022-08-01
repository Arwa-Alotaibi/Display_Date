package com.arwa.display;

import java.text.SimpleDateFormat;


import java.util.Date;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DisplayDate {
	@RequestMapping("/")
	public String dashboard() {
		
		return "dashboard.jsp";
	}
	
	@RequestMapping("/date")
	public String DisplayDate(Model model) {
		Date date = new Date();
		//E	Day name in week
		//d	Day in month
		//M	Month in year
		SimpleDateFormat CurrentDate  = new SimpleDateFormat(" EEEEE,  dd   MMMM, yyyy ");
		String current_Date = CurrentDate.format(date);
		model.addAttribute("current_Date",current_Date);
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String DisplayTime(Model model) {
		Date date = new Date();
		// hHour in am/pm (1-12)
		//m	Minute in hour
		//a	Am/pm marker
		SimpleDateFormat currentTime = new SimpleDateFormat("hh:mm a");
		String current_time = currentTime.format(date); 
		
		model.addAttribute("current_time",current_time);
		
		
		return "time.jsp";

		

	}
	
	

	
	
}
