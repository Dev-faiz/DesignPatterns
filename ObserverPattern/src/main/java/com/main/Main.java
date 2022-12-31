package com.main;

public class Main {
	
	public static void main(String[] args) {
		
		PaymentManager pm = new PaymentManager() ;
		
		
		PaymentListener p1 = new PaymentEventLogger();
		PaymentListener p2 = new NotificationManager();
//		
//		
		pm.registerPaymentListener(p2);
		pm.registerPaymentListener(p1);
		pm.registerPaymentListener(()-> System.out.println(":-)"));
		pm.registerPaymentListener( new NotificationManager() );
		pm.registerPaymentListener( new PaymentEventLogger());
		pm.pay();
		
		pm.unregisterPaymentListener(p2);
	
		pm.pay();
		
	}

}
