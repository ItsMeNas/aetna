package aenta.example.aenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages={"aetna.com.aetna"})
@RestController
@EnableAutoConfiguration

public class AentaApplication {
	
	@RequestMapping("/")
	String home() {
        return "Welcom to Aetna, a leading healthcare company in the USA!";}

	public static void main(String[] args) {
		SpringApplication.run(AentaApplication.class, args);
	}

}
