package io.sonnetsaif.aop_concept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopConceptApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		PaymentService paymentService = context.getBean(PaymentService.class);
		paymentService.makeDebitPayment("Input");
		paymentService.makeCreditPayment();
	}
}
