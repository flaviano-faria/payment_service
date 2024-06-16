package br.com.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.paymentservice.processor.PaymentServiceProcessor;

@Controller
public class PaymentServiceController {
	
	@Autowired
	private PaymentServiceProcessor paymentProcessor;
	
	@PostMapping(value="/payment/credit")
	public void processCreditPayment() {
		paymentProcessor.processCreditCardPayment();
	}
}
