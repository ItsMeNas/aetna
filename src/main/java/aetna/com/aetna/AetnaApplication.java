package aetna.com.aetna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@ComponentScan(basePackages={"aetna.com.aetna"})
@RestController
@EnableAutoConfiguration
public class AetnaApplication {


 @RequestMapping("/")
    String home() {
        return "Welcome to Aetna USA!";
    }

	public static void main(String[] args) {
		SpringApplication.run(AetnaApplication.class, args);
	}

}
