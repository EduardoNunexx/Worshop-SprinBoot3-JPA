package br.com.EduardoNunesSoftwareEnguineer.SpringBootProject01.repositories;

import br.com.EduardoNunesSoftwareEnguineer.SpringBootProject01.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {

}
