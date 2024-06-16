package br.com.paymentservice.processor;

import org.springframework.stereotype.Service;

import br.com.paymentservice.service.CreditCardPaymentStrategy;
import br.com.paymentservice.service.DebitCardPaymentStrategy;
import br.com.paymentservice.service.PaymentStrategy;
import br.com.paymentservice.service.PixPaymentStrategy;

@Service
public class PaymentServiceProcessor {
	
	private PaymentStrategy paymentStrategy;
	
	public void processDebitCardPayment() {
		paymentStrategy = new DebitCardPaymentStrategy();
		paymentStrategy.doPayment(1000);
	}

	public void processCreditCardPayment() {
		paymentStrategy = new CreditCardPaymentStrategy();
		paymentStrategy.doPayment(1000);
	}
	
	public void processPixPayment() {
		paymentStrategy = new PixPaymentStrategy();
		paymentStrategy.doPayment(1000);
	}


}
