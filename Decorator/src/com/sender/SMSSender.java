package com.sender;

import com.notification.NotificationSender;

public class SMSSender implements NotificationSender {
	
	private final NotificationSender notificationSender ;
	
	
	public SMSSender( NotificationSender sender ) {
		this.notificationSender = sender ; 
	}

	@Override
	public void send() {
		
		if(notificationSender != null) notificationSender.send();
		System.out.println("SMS send");
		
	}

}
