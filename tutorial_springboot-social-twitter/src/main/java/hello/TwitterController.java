package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TwitterController {

    @Autowired
    private Twitter twitter;

    @Autowired
    private ConnectionRepository connectionRepository;

    @RequestMapping("/")
    public String tweets(Model model) {

        if (connectionRepository.findPrimaryConnection(Twitter.class) == null) {
            return "redirect:/connect/twitter";
        }
        
        List<Tweet> tweets = twitter.timelineOperations().getHomeTimeline();
        TwitterProfile profile = twitter.userOperations().getUserProfile();
        
        model.addAttribute("tweets", tweets);
        model.addAttribute("profile", profile);
        
        return "tweetsPage";
    }
}
