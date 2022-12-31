package com.main;

public class NotificationManager implements PaymentListener{

	private void sendNotification() {
		
		System.out.println("Notification of payment ");
	}

	@Override
	public void paymentProcess() {	
		sendNotification();
	}
}
