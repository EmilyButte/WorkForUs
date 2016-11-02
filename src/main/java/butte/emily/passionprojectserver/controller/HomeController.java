package butte.emily.passionprojectserver.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by emilybutte on 11/1/16.
 */

@Controller
@CrossOrigin(origins = "http://localhost:9000")
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String getHomePage(){
        log.debug("Getting home page");
        return "home";
    }
}

