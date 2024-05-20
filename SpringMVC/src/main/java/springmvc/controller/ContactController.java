package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/contact")
	public String showForm() {

		return "contact";

	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handlerForm(@ModelAttribute User user,Model model)
	{
	   System.out.println(user);
	   
	   if(user.getUname().isBlank()) {
		   return "redirect:/contact";
	   }
	   
	   int createUser = this.userService.createUser(user);
	
		model.addAttribute("msg","User created with id "+createUser);

		//model.addAttribute("user", user);

		return "success";
	}

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handlerForm(@RequestParam("email") String
	 * emailvariable, @RequestParam("uname") String username,
	 * 
	 * @RequestParam("password") String userPassword, Model model) {
	 * System.out.println("User Email " + emailvariable);
	 * System.out.println("User Name " + username);
	 * System.out.println("User Password " + userPassword);
	 * 
	 * User user = new User(); user.setEmail(emailvariable);
	 * user.setUname(username); user.setPassword(userPassword);
	 * System.out.println(user);
	 * 
	 * // process
	 * 
	 * // model.addAttribute("email",emailvariable); //
	 * model.addAttribute("uname",username); //
	 * model.addAttribute("password",userPassword);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 */
}
