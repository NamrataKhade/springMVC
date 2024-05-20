package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
  /*	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one Handler");
		//return " ";
		return "redirect:two";
		//redirect using redirct:url
	}*/

	//redirect using RedirectView
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is one Handler");
		RedirectView redirectView=new RedirectView();
		
		//redirectView.setUrl("two");
		
		redirectView.setUrl("http://www.google.com");
		
		return redirectView;
		
	}		
	
	@RequestMapping("/two")
	public String two(){
		System.out.println("This is 2nd handler");
		return "contact";
	}
}
