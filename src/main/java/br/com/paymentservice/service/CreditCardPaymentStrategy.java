package br.com.paymentservice.service;

public class CreditCardPaymentStrategy implements PaymentStrategy {

	@Override
	public void doPayment(int value) {
		System.out.println("Processing credit card payyment");

	}

}
