package br.com.cwi.cursoaws.repository;

import br.com.cwi.cursoaws.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);
}
