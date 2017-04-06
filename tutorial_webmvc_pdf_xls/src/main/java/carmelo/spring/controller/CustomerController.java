package carmelo.spring.controller;

import carmelo.spring.model.Customer;
import carmelo.spring.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService cs;

    @ModelAttribute("customerList")
    public List<Customer> getCustomerList() {
        return cs.findAll();
    }

    @RequestMapping("/")
    public String verTodos(Model model) {
        return "customer";
    }

    @RequestMapping("/pdf")
    public String generarPdf(Model model) {
        return "pdfView";
    }

    @RequestMapping("/xls")
    public String generarXls(Model model) {
        return "xlsView";
    }
}
