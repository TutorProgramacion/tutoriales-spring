package carmelo.spring.controller;

import carmelo.spring.model.Product;
import carmelo.spring.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @Autowired
    private ProductService products;

    @RequestMapping("/product")
    public String productList(Model model) {
        model.addAttribute("productList", products.productList());
        return "product";
    }

    @RequestMapping("/product/delete/{id}")
    public String productDelete(@PathVariable("id") Long id, Model model) {
        products.productDelete(id);
        return "redirect:/product";
    }

    @RequestMapping("/product/form")
    public String productForm(Model model) {
        model.addAttribute("product", new Product());  
        return "productform";
    }

    @RequestMapping(value = "/product/create", method = RequestMethod.POST)
    public String productCreate(@ModelAttribute("product") Product product) {
        products.productAdd(product);
        return "redirect:/product";
    }
}
