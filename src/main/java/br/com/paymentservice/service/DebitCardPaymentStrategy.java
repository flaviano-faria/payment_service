package br.com.paymentservice.service;

public class DebitCardPaymentStrategy implements PaymentStrategy {

	@Override
	public void doPayment(int value) {
		System.out.println("Processing debit card payment ");

	}

}
