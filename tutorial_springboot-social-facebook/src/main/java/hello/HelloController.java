package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    private final Facebook facebook;
    private final ConnectionRepository connectionRepository;

    @Autowired
    public HelloController(Facebook facebook, ConnectionRepository connectionRepository) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @RequestMapping("/")
    public String facebook(Model model) {
        
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }

        model.addAttribute("perfil", facebook.userOperations().getUserProfile());
        model.addAttribute("feed", facebook.feedOperations().getFeed());

        return "hello";
    }

}
