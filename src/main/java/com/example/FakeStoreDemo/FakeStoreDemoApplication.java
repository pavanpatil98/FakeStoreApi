package com.example.FakeStoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//It enables automatic auditing of JPA entities in a Spring Boot application.
@EnableJpaAuditing
public class FakeStoreDemoApplication {

	public static void main(String[] args) {

		//Routing controller service gateway
		Dotenv dotenv = Dotenv.configure().load();
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(),entry.getValue()));
		String dbUrl = dotenv.get("FAKE_STORE_URL");
		String PORT = dotenv.get("PORT");
		System.out.println(dbUrl+"==============================");

		SpringApplication.run(FakeStoreDemoApplication.class, args);
	}

}
