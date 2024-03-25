package br.com.EduardoNunesSoftwareEnguineer.SpringBootProject01.config;

import br.com.EduardoNunesSoftwareEnguineer.SpringBootProject01.entities.Users;
import br.com.EduardoNunesSoftwareEnguineer.SpringBootProject01.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        Users u1 = new Users(null,"Jhon","Jhon@gmail.com","88944651","12345");
        Users u2 = new Users(null,"James","James@gmail.com","88136651","12245");
        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
