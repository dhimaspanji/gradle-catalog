package id.co.project.dhimas.gradle.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleCatalogApplication {

	public static void main(String[] args) {
		System.out.println("THIS IS FOR TEST PIPELINE");
		SpringApplication.run(GradleCatalogApplication.class, args);
	}

}
