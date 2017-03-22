package carmelo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VentasController {

    @RequestMapping("/ventas")
    public String porVendedor(
            @RequestParam("nombre") String nombre,
            @RequestParam("mes") Integer mes,
            Model model) {

        model.addAttribute("vendedor", nombre);
        model.addAttribute("ventas", "Listado de ventas para el mes: " + mes);

        return "ventas";
    }

    @ResponseBody
    @RequestMapping("/vendedor/{id}")
    public String vendedor(@PathVariable("id") Long id) {
        return "Buscar vendor con ID = " + id;
    }
    
    @ResponseBody
    @RequestMapping("/depto/{dep}/vendedor/{id}")
    public String departamentoVendedor(
            @PathVariable("id") Long id,
            @PathVariable("dep") String dep) {
        
        String res = "Este es el departamento de: %s, y el vendedor ID: %d";
        
        return String.format(res, dep, id);
    }
}
