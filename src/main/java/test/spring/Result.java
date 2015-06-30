package test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/result")
@SessionAttributes("user")

public class Result {

	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView showAddGreetingPage(@ModelAttribute("user") User user) {		
		
		ModelAndView model = new ModelAndView("result");
		return model;
	}
	
}
