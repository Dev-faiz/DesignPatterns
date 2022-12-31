package com.main;

public class PaymentEventLogger implements PaymentListener {
	
	private void logEvent() {
		
		System.out.println("Payment Recieved");
		
	}

	@Override
	public void paymentProcess() {
		logEvent();
	}

}
