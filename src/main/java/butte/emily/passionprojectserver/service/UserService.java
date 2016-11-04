package butte.emily.passionprojectserver.service;

import butte.emily.passionprojectserver.domain.User;
import butte.emily.passionprojectserver.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emilybutte on 11/3/16.
 */

@Service
public class UserService {

    //This class inserts data into the database and gets all the information from the database

    //log instance prints out what is going on in the method calls
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    // Jdbc class is responsible for executing tasks against the database
    @Autowired
    UserRepository repo;

    public void insertData(){
        log.info("> Inserting data...");
        repo.save(new User("emily@email.com", "123"));
        repo.save(new User("evan@email.com", "456"));
        repo.save(new User("davey@email.com", "789"));
        log.info("> Done.");
    }

     // returns data
    public List<User> findAll(){
        return repo.findAll();
    }



}
