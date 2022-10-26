package redes.App.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"redes.App.*"})
@ComponentScan({"redes.App.controller", "redes.App.repository", "redes.App.service", "redes.App.domain",
		"redes.App.configuration", "redes.App.util"})
@EntityScan("redes.App.domain")
@EnableJpaRepositories("redes.App.repository")
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
