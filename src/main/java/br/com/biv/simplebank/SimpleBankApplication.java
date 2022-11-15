package br.com.biv.simplebank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.biv.simplebank")
@EntityScan(basePackages = "br.com.biv.simplebank.domain")
public class SimpleBankApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleBankApplication.class, args);
	}

}
