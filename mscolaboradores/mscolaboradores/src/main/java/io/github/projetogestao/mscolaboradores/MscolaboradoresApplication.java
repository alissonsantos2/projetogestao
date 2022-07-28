package io.github.projetogestao.mscolaboradores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MscolaboradoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscolaboradoresApplication.class, args);
	}

}
