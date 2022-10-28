package redes.App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import redes.App.domain.User;
import redes.App.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> listAll() {return userRepository.findAll();}

    public void save(User user) {
        user.setPassword(getEncodedPassword(user.getPassword()));
        userRepository.save(user);
    }

    public User get(int id) {
        return userRepository.findById(id).get();
    }

    public void delete(int id) {
        userRepository.deleteById(id);
    }

    public User findByEmail(String email){ return  userRepository.findByEmail(email); }

   public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
