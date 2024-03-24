package br.com.EduardoNunesSoftwareEnguineer.SpringBootProject01.resources;

import br.com.EduardoNunesSoftwareEnguineer.SpringBootProject01.entities.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<Users> findAll(){
        Users u = new Users(1L,"James","james@gmail.com", "88 99922221","123");
        return ResponseEntity.ok().body(u);
    }
}
