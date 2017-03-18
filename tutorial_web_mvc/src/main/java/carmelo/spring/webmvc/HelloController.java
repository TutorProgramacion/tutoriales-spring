package carmelo.spring.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public ModelAndView saluda() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("titulo", "Tutoriales Spring MVC");
        mv.addObject("mensaje", "Mi Primera Aplicacion Web Spring MVC");
        mv.setViewName("hello");
        
        return mv;
    }
}
