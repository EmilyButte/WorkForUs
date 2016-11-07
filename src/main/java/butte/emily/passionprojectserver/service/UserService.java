package butte.emily.passionprojectserver.service;

import butte.emily.passionprojectserver.domain.User;
import butte.emily.passionprojectserver.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

/**
 * Created by emilybutte on 11/7/16.
 */

@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepository userRepo;

    public void insertData() throws ParseException{
        log.info("> Inserting data...");
        userRepo.save(new User("emily@email.com", "emily"));
        userRepo.save(new User("evan@email.com", "evan"));
        userRepo.save(new User("davey@email.com", "davey"));
        log.info("> Done.");
    }

    public List<User> findAll(){
        return userRepo.findAll();
    }
}
