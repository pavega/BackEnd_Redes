package redes.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import redes.App.domain.Role;
import redes.App.service.RoleService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/api/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/getAllRoles")
    public List<Role> list() {
        return roleService.listAll();
    }

    @GetMapping("/getRole/{id}")
    public ResponseEntity<Role> get(@PathVariable Integer id) {
        try {
            Role role = roleService.get(id);
            return new ResponseEntity<Role>(role, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Role>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public void add(@RequestBody Role role){
        roleService.save(role);
    }


    @PutMapping(value = "/update")
    public void update(@RequestBody Role role){
        roleService.save(role);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        roleService.delete(id);
    }
}
