package id.co.project.dhimas.gradle.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleCatalogApplication {

	public static void main(String[] args) {
		System.out.println("TEST TRIGGER PIPELINE PULL REQUEST");
		SpringApplication.run(GradleCatalogApplication.class, args);
	}

}
