package butte.emily.passionprojectserver.service;

import butte.emily.passionprojectserver.domain.User;
import butte.emily.passionprojectserver.domain.UserCreateForm;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by emilybutte on 11/1/16.
 */
public interface UserService {
    Optional<User> getUserById(long id);
    Optional<User> getUserByEmail(String email);
    Collection<User> getAllUsers();
    User create(UserCreateForm form);
}
