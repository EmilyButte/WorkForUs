package butte.emily.passionprojectserver.controller;


import butte.emily.passionprojectserver.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by emilybutte on 10/31/16.
 */

@Controller
public class UsersController {

    private static final Logger log = LoggerFactory.getLogger(UsersController.class);
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService){
        this.userService = userService;
    }


    @RequestMapping("/users")
    public ModelAndView getUsersPage (){
        log.debug("Getting user page");
        return new ModelAndView("users", "users", userService.getAllUsers());
    }

}
