package com.iterator;

public class Main {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,7,8,9,6,4,9879,454,4};
		Container c = new Container(arr);
//		System.out.println(c.previous());
		
		while(c.hasNext() ) {
			System.out.println(c.next());
		}
	}

}
