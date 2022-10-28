package redes.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import redes.App.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
