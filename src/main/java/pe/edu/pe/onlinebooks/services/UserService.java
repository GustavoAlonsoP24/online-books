package pe.edu.pe.onlinebooks.services;
import pe.edu.pe.onlinebooks.models.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    User getUserByUsername(String username);
    User updateUser(Long id,User user);
    void deleteUser(Long id);
}
