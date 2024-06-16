package br.com.paymentservice.exec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.paymentservice.controller,br.com.paymentservice.processor")
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

}
