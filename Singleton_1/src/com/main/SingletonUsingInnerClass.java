package com.main;

public class SingletonUsingInnerClass {
	
	public SingletonUsingInnerClass() {}
	
	private static final class SingletonHolder {
		private static final SingletonUsingInnerClass SINGLETON = new SingletonUsingInnerClass() ;
	}
	
	public static SingletonUsingInnerClass getInstance() {
		return  SingletonHolder.SINGLETON ;
	}
	
}
