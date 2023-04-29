package pe.edu.pe.onlinebooks.repositories;

import org.springframework.data.repository.CrudRepository;
import pe.edu.pe.onlinebooks.models.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {

    Optional<User> findByUsername(String username);
}
