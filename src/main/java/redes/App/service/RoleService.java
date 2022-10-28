package redes.App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redes.App.domain.Role;
import redes.App.repository.RoleRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> listAll() {return roleRepository.findAll();}

    public void save(Role role) {
        roleRepository.save(role);
    }

    public Role get(int id) {
        return roleRepository.findById(id).get();
    }

    public void delete(int id) {
        roleRepository.deleteById(id);
    }
}
