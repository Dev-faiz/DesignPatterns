package com.notification;

import com.sender.EmailSender;
import com.sender.SMSSender;

public class Main {
	
	public static void main(String[] args) {
		
		NotificationSender notificationSender = new EmailSender(new SMSSender(null));
		
		NotificationSender notificationSender2 = new SMSSender(new EmailSender(null));
		
		NotificationSender notificationSender3 = new SMSSender(new EmailSender(new SMSSender(null)));
		
		
		
		notificationSender.send();
		System.out.println("================================");
		notificationSender2.send();
		System.out.println("================================");
		notificationSender3.send();
		
	}

}
