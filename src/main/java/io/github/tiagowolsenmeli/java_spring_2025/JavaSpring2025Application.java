package io.github.tiagowolsenmeli.java_spring_2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaSpring2025Application {

	@GetMapping("/hello-world")
	public String helloWorld(){
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(JavaSpring2025Application.class, args);
	}

}
