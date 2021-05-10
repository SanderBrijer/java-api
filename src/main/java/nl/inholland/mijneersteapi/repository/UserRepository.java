package nl.inholland.mijneersteapi.repository;

import nl.inholland.mijneersteapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
