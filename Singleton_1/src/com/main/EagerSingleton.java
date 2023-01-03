package com.main;

public class EagerSingleton {
	
	private static EagerSingleton SINGLETON = new EagerSingleton() ;
	
	private EagerSingleton() {} ;
	
	public static EagerSingleton getInstance() {
		
		return  SINGLETON ; 
	}

}
