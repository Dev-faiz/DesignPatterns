package com.sender;

import com.dependency.DependencyNotificationSender;

public class AppNotificationSender implements NotificationSender {
	
	private final DependencyNotificationSender dependencyNotificationSender ;
	
	public AppNotificationSender( DependencyNotificationSender d ) {
		this.dependencyNotificationSender = d ; 
	}
	
	public void sendNotification() {
		
		dependencyNotificationSender.send(); 
	}

}
