package carmelo.spring.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ImageController {

    @Autowired
    private JdbcTemplate jdbc;

    @RequestMapping("/")
    public ModelAndView home() {

        String sql = "SELECT * FROM imagen";
        List<Map<String, Object>> imageList = jdbc.queryForList(sql);

        return new ModelAndView("home", "imageList", imageList);
    }

    @RequestMapping("/image")
    public ModelAndView image(@RequestParam("nombre") String nombre) {
        return new ModelAndView("image", "nombre", nombre);
    }

    @RequestMapping(path = "/form", method = RequestMethod.POST)
    public String handleFormUpload(
            @RequestParam("file") MultipartFile file) throws IOException {

        if (!file.isEmpty()) {

            String sql = "INSERT INTO imagen (nombre, tipo, tamano, pixel) VALUES(?, ?, ?, ?)";

            String nombre = file.getOriginalFilename();
            String tipo = file.getContentType();
            Long tamano = file.getSize();
            byte[] pixel = file.getBytes();

            jdbc.update(sql, nombre, tipo, tamano, pixel);
        }

        return "redirect:/";
    }

    @RequestMapping(value = "/uploaded")
    public void getUploadedPicture(
            @RequestParam("nombre") String nombre, HttpServletResponse response)
            throws IOException {

        String sql = "SELECT pixel, tipo FROM imagen WHERE nombre = '" + nombre + "'";
        List<Map<String, Object>> result = jdbc.queryForList(sql);

        if (!result.isEmpty()) {
            byte[] bytes = (byte[]) result.get(0).get("PIXEL");
            String mime = (String) result.get(0).get("TIPO");

            response.setHeader("Content-Type", mime);
            response.getOutputStream().write(bytes);
        }
    }

}
