package com.bloodbank.controller;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	/*
	 * @Autowired SessionFactory sessionFactory;
	 */
	
		@RequestMapping(value="/")
		public ModelAndView test(HttpServletResponse response, Model model) throws Exception{
			return new ModelAndView("home");
		}

		/*
		 * public SessionFactory getSessionFactory() { return sessionFactory; }
		 * 
		 * public void setSessionFactory(SessionFactory sessionFactory) {
		 * this.sessionFactory = sessionFactory; }
		 */
		
}
