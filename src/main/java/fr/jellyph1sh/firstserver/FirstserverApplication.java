package fr.jellyph1sh.firstserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstserverApplication.class, args);
	}

}
