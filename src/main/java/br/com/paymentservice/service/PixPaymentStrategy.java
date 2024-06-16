package br.com.paymentservice.service;

public class PixPaymentStrategy implements PaymentStrategy {

	@Override
	public void doPayment(int value) {
		System.out.println("Processing pix payment");

	}

}
