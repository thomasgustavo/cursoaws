package br.com.cwi.cursoaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.cwi.cursoaws.repository")
@EntityScan("br.com.cwi.cursoaws.model")
public class CursoawsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoawsApplication.class, args);
	}
}
