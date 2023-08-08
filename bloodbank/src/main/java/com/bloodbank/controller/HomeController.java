package com.bloodbank.controller;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bloodbank.model.Person;
import com.bloodbank.service.PersonService;

@Controller
public class HomeController {
	
	@Autowired
	PersonService personService;
	
		@RequestMapping(value="/")
		public ModelAndView test(HttpServletResponse response, Model model) throws Exception{
			return new ModelAndView("home");
		}

		@RequestMapping(value="/createBloodDonorRegistration", method = RequestMethod.GET)
		public ModelAndView createUser(HttpServletResponse response, Model model) throws Exception{
			return new ModelAndView("bloodDonorRegistrationPage");
		}
		
		@RequestMapping(value="/createBloodDonorRegistration", method = RequestMethod.POST)
		public void createUserPost(@ModelAttribute("person") Person person, Model model) throws Exception{
			System.out.println(person.getName());
			System.out.println(person.getId());
			System.out.println(person.getMobileno());
			System.out.println(person.getAge());
			personService.createPerson(person);
		}
		
}
