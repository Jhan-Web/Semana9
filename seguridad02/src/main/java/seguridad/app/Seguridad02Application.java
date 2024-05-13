package seguridad.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "seguridad")
public class Seguridad02Application {

	public static void main(String[] args) {
		SpringApplication.run(Seguridad02Application.class, args);
	}

}
