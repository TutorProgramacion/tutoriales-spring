package carmelo.spring.controller;

import carmelo.spring.model.Person;
import carmelo.spring.validator.PersonValidator;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new PersonValidator());
    }

    @RequestMapping(path = {"/", "/form"})
    public ModelAndView home() {
        return new ModelAndView("home", "person", new Person());
    }

    @RequestMapping(path = {"/validar"}, method = RequestMethod.POST)
    public ModelAndView validar(@Validated Person person, BindingResult result) {
        String viewname = result.hasErrors() ? "home" : "valid";
        return new ModelAndView(viewname, "person", person);
    }
    
    @ModelAttribute("paisList")
    public List<String> paisList(){
        return Arrays.asList("...", "Panama", "Argentina", "Peru", "Chile", "Otros");
    }
}
