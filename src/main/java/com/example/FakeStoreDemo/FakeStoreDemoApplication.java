package com.example.FakeStoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;
@SpringBootApplication
public class FakeStoreDemoApplication {

	public static void main(String[] args) {


		Dotenv dotenv = Dotenv.load();
		String dbUrl = dotenv.get("FAKE_STORE_URL");

		SpringApplication.run(FakeStoreDemoApplication.class, args);
	}

}
