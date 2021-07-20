package football.service;

import football.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
