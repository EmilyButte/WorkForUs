package butte.emily.passionprojectserver.service;

import butte.emily.passionprojectserver.domain.User;
import butte.emily.passionprojectserver.domain.UserCreateForm;
import butte.emily.passionprojectserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by emilybutte on 11/1/16.
 */

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    @Autowired
    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Optional<User> getUserById(long id) {
        return Optional.ofNullable(userRepo.findOne(id));
    }

    @Override
    public Optional<User> getUserByEmail(String email){
        return userRepo.findOneByEmail(email);
    }

    @Override
    public Collection<User> getAllUsers(){
        return userRepo.findAll(new Sort("email"));
    }

    @Override
    public User create(UserCreateForm form) {
        User user = new User();
        user.setEmail(form.getEmail());
        user.setPasswordHash(new BCryptPasswordEncoder().encode(form.getPassword()));
        return userRepo.save(user);
    }
}
