package carmelo.spring.controller;

import carmelo.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public ModelAndView verInicio() {
        return new ModelAndView("customer");
    }

    @RequestMapping("/report")
    public String verReporte(Model model,
            @RequestParam(
                    name = "format",
                    defaultValue = "pdf",
                    required = false) String format) {

        model.addAttribute("format", format);
        model.addAttribute("datasource", customerService.findAll());
        model.addAttribute("AUTOR", "Tutor de programacion");

        return "customer_report";
    }
}
