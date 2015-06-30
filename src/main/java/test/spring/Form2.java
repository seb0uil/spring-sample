package test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form2")
@SessionAttributes("user")

public class Form2 {

	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView showAddGreetingPage(@ModelAttribute("user") User user) {		
		
		ModelAndView model = new ModelAndView("form2");
		return model;
	}
	
}
