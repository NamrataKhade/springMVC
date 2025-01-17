package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController { 
	
	//@RequestMapping(path="/home", method=RequestMethod.POST)
	@RequestMapping("/")
	public String home(Model model) 
	{
		
		System.out.println("This is home url");
		model.addAttribute("name","Namrata Khade");
		model.addAttribute("id",1111);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Kanif");
		friends.add("Anuradha");
		friends.add("Tejaswi");
		model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()  
	{
		System.out.println("This is about Controller");
	    return "about";	
	}
	
	// Services
	//help
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		
		//creating modelandview
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Namrata");
		
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		//now.toString();
		
		//setting view name
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
