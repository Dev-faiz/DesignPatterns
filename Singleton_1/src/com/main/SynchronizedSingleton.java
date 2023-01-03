package com.main;

public class SynchronizedSingleton {
	
	private static SynchronizedSingleton SINGLETON = null ;
	
	private SynchronizedSingleton() {} ;
	
	// not recommended approach
	public static synchronized SynchronizedSingleton getInstance() {
		
		if( SINGLETON == null ) {
			SINGLETON = new SynchronizedSingleton() ; 
		}
		
		
		return  SINGLETON ; 
	}

}
