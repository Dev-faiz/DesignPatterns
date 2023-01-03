package com.main;

public class Main {
	
	public static void main(String[] args) {
		
		LazySingleton s1 = LazySingleton.getInstance(); // here object will get created 
		LazySingleton s2 = LazySingleton.getInstance(); // same singleton object will created 
		LazySingleton s3 = LazySingleton.getInstance();
		LazySingleton s4 = LazySingleton.getInstance();
		LazySingleton s5 = LazySingleton.getInstance();
		LazySingleton s6 = LazySingleton.getInstance();
		
		
	}

}
