package com.example.spring;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/SecondController")
public class SecondController {
	
	//private static final Logger logger = Logger.getLogger(SecondController.class);
	
	@RequestMapping(value="/GetDetails", method = RequestMethod.GET)
	public ModelAndView visitHome() {
		//logger.debug("Second Controller is executed!");
		return new ModelAndView("GetDetails");
	}

}
