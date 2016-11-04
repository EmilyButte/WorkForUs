//package butte.emily.passionprojectserver.controller;
//
//import butte.emily.passionprojectserver.UserAlreadyExistsException;
//import butte.emily.passionprojectserver.domain.User;
//import butte.emily.passionprojectserver.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
///**
// * Created by emilybutte on 11/2/16.
// */

//@RestController
//@CrossOrigin
//public class LoginController {
//
//    @Autowired
//    UserRepository userRepo;
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String sayHello() {
//        return "Hello World";
//    }
//
//    @RequestMapping(value = "/findByEmail/{email}", method = RequestMethod.GET)
//    public User findByEmail(@PathVariable String email){
//        User user = userRepo.findByEmail(email);
//        System.out.println(user);
//        return user;
//    }
//
//    @RequestMapping(value = "/create" , method=RequestMethod.POST , consumes= MediaType.APPLICATION_JSON_VALUE)
//    public String createUser(@RequestBody User request) {
//        try {
//            if(userRepo.findByEmail(request.getEmail()) != null) {
//                throw new UserAlreadyExistsException();
//            }
//            userRepo.saveAndFlush(new User(request.getEmail(), request.getPassword()));
//        } catch (UserAlreadyExistsException e) {
//
//            return "{\"message\":\"User already exists!\"}";
//        }
//        return "{\"message\":\"Success!\"}";
//    }
//}
