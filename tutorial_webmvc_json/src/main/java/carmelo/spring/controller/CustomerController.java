package carmelo.spring.controller;

import carmelo.spring.model.Customer;
import carmelo.spring.service.CustomerService;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService cs;

    @RequestMapping(value = {"/", "/index"})
    public String customerJsp(Model model) {
        model.addAttribute("customerList", cs.findAll());
        return "customer";
    }

    @ResponseBody
    @RequestMapping("/data")
    public List<Customer> customerJson() {
        return cs.findAll();
    }

    @RequestMapping(name = "/list")
    public String customerJsonList(Model model) {
        model.addAttribute(cs.findAll());
        model.addAttribute(JsonView.class.getName(), Customer.TestView.class);
        return "jsonView";
    }

}
