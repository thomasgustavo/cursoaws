package br.com.cwi.cursoaws.repository;

import br.com.cwi.cursoaws.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByUsername(String username);
}