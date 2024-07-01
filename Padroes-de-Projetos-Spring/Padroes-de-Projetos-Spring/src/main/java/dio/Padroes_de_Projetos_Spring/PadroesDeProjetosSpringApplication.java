package dio.Padroes_de_Projetos_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesDeProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetosSpringApplication.class, args);
	}

}
