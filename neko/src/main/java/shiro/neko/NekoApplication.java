package shiro.neko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("shiro.neko")
@EntityScan("shiro.neko")
@SpringBootApplication
public class NekoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NekoApplication.class, args);
	}

}
