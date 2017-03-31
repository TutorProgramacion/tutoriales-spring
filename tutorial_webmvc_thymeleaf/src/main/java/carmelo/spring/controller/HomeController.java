package carmelo.spring.controller;

import carmelo.spring.model.Tipo;
import carmelo.spring.model.Usuario;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @ModelAttribute("usuarios")
    public List<Usuario> getUserList() {
        return Arrays.asList(
            new Usuario("Juan", "Perez", "jp@gmail.com", "1a", 20, true, Tipo.Administrador),
            new Usuario("Maria", "Lopez", "ml@gmail.com", "1b", 21, false, Tipo.Estandar),
            new Usuario("Beto", "Luna", "bluna@gmail.com", "1c", 20, true, Tipo.Anonimo)
        );
    }

    @RequestMapping(value = {"/", "/home"})
    public String viewHomePage(Model model) {
        model.addAttribute("fecha", LocalDate.now());
        return "home";
    }
}
