package com.main;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {
	
	private final List<PaymentListener> paymentListeners = 
			new ArrayList<PaymentListener>() ;
//	
//	private final NotificationManager nm =  new NotificationManager() ;
//	
//	private final PaymentEventLogger pel = new PaymentEventLogger() ;
	
	public void pay() {
		
//		nm.sendNotification();
//		pel.logEvent();
		
//		paymentListeners.forEach(p -> p.paymentProcess());
		paymentListeners.forEach(PaymentListener::paymentProcess);
	}

	public void registerPaymentListener( PaymentListener p ) {
		paymentListeners.add(p);
	}
	
	public void unregisterPaymentListener( PaymentListener p ) {
		paymentListeners.remove(p);
	}
	
}
