package football.service;

import football.model.User;
import java.util.List;

public interface UserService {
    User add(User user);

    User get(Long id);

    User findByEmail(String email);

    List<User> getAll();
}
