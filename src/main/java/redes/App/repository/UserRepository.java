package redes.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import redes.App.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}
