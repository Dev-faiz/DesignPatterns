package com.main;

public class SynchronizedSingleton2 {
	
	private static SynchronizedSingleton2 SINGLETON = null ;
	
	private SynchronizedSingleton2() {} ;
	
	public static synchronized SynchronizedSingleton2 getInstance() {
		
		if( SINGLETON == null ) {
			synchronized (SynchronizedSingleton2.class) {
				if(SINGLETON == null) {
					SINGLETON = new SynchronizedSingleton2() ; 
				}
			}
			SINGLETON = new SynchronizedSingleton2() ; 
		}
		return  SINGLETON ; 
	}
}
