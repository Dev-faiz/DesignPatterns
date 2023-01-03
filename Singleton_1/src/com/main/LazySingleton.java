package com.main;

public class LazySingleton {
	
	// lazy implementation of singleton
	private static LazySingleton SINGLETON = null ;
	
	private LazySingleton() {} ;
	
	public static LazySingleton getInstance() {
		
		if( SINGLETON == null ) {
			SINGLETON = new LazySingleton() ; 
		}
		
		
		return  SINGLETON ; 
	}

}
