package com.main;

public class EagerSingleton {
	
	private static EagerSingleton SINGLETON = null ;
	
	private EagerSingleton() {} ;
	
	public static EagerSingleton getInstance() {
		
		if( SINGLETON == null ) {
			SINGLETON = new EagerSingleton() ; 
		}
		
		
		return  SINGLETON ; 
	}

}
