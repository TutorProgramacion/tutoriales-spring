package carmelo.spring.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HelloController {

    @RequestMapping(value = "/fecha")
    @ResponseBody
    public String fecha() {
        return "Hoy es: " + LocalDate.now()
                .format(DateTimeFormatter.ISO_DATE);
    }

    @RequestMapping(value = "/hola")
    public ModelAndView hola() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("titulo", "Tutoriales Spring MVC :: HelloController");
        mv.addObject("mensaje", "saludo desde el metodo: <br /> "
                + "<code>public ModelAndView hola() {...}</code>");

        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping(value = "/hello")
    public String hello(Model model) {
        model.addAttribute("titulo", "Tutoriales Spring MVC :: HelloController");
        model.addAttribute("mensaje", "saludo desde el metodo: <br /> "
                + "<code>public String hello(Model) {...}</code>");

        return "hello";
    }
}
