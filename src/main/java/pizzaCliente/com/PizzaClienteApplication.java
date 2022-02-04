package pizzaCliente.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PizzaClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaClienteApplication.class, args);
	}

}
