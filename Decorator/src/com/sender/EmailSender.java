package com.sender;

import com.notification.NotificationSender;

public class EmailSender implements NotificationSender {

private final NotificationSender notificationSender ;
	
	
	public EmailSender( NotificationSender sender ) {
		this.notificationSender = sender ; 
	}

	@Override
	public void send() {
		
		if(notificationSender != null) notificationSender.send();
		System.out.println("Email send");
		
	}

}