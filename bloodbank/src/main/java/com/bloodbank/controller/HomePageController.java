package com.bloodbank.controller;

import java.security.Principal;
import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

//import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bloodbank.model.Person;
import com.bloodbank.service.PersonService;

@Controller
public class HomePageController {
	
	@Autowired
	PersonService personService;
	
		@RequestMapping(value="/")
		public ModelAndView test(HttpServletResponse response, Model model) throws Exception{
			return new ModelAndView("homepage");
		}
		
		@RequestMapping(value="/contact")
		public ModelAndView contact(HttpServletResponse response, Model model) throws Exception{
			return new ModelAndView("contactpage");
		}
		
		@RequestMapping(value="/gallery")
		public ModelAndView gallery(HttpServletResponse response, Model model) throws Exception{
			return new ModelAndView("gallerypage");
		}
		
		
		
		
		

		/*
		 * @RequestMapping(value="/createBloodDonorRegistration", method =
		 * RequestMethod.GET) public ModelAndView createUser(HttpServletResponse
		 * response, Model model) throws Exception{ return new
		 * ModelAndView("bloodDonorRegistrationPage"); }
		 * 
		 * @RequestMapping(value="/createBloodDonorRegistration", method =
		 * RequestMethod.POST) public void createUserPost(@ModelAttribute("person")
		 * Person person, Model model) throws Exception{
		 * System.out.println(person.getName()); System.out.println(person.getId());
		 * System.out.println(person.getMobileno());
		 * System.out.println(person.getAge()); personService.createPerson(person); }
		 */
		/*
		 * @ResponseBody
		 * 
		 * @GetMapping("/home") public String startingPage(Principal principal,
		 * Authentication auth) { System.out.println("-----------------");
		 * System.out.println("-----------------");
		 * System.out.println("-----------------");
		 * System.out.println("-----------------");
		 * System.out.println("-----------------");
		 * System.out.println(auth.getPrincipal().toString());
		 * System.out.println(auth.getDetails());
		 * System.out.println(auth.isAuthenticated());
		 * 
		 * 
		 * Collection<? extends GrantedAuthority> authh = auth.getAuthorities();
		 * System.out.println("-------------" + authh);
		 * 
		 * System.out.println(principal.getName()); return "startingPage"; }
		 */
		
		

		
		@GetMapping("/accessdenied")
		public String accessdenied() {
			return "access-denied";
		}
		
}
