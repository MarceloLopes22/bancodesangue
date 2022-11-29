package com.wk.candidato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.wk.candidato.entidades.*")
@EnableJpaRepositories("com.wk.candidato.repository.*")
@ComponentScan(basePackages = { "com.wk.candidato.entidades.*" })
public class CandidatoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidatoApplication.class, args);
	}

}
