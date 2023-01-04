package com.iterator;

public class Container implements Iterator{
	private int cursor = -1; 
	private int[] values ;

	public Container(int[] v) {
		this.values = v ; 
	}
	
	@Override
	public boolean hasNext() {
		return cursor < values.length-1;
	}

	@Override
	public Integer next() {
		if( hasNext() ) {	
			cursor++ ;
			return values[cursor];
		}	
			return null ; 	
	}
			
			
	@Override
	public int get() {
		
		return  values[cursor];
		
	}

	@Override
	public boolean hasPrevious() {
		
		return cursor < 1 ;
	}

	@Override
	public Integer previous() {
		// TODO Auto-generated method stub
		if(hasPrevious()) {
			cursor-- ;
			return values[cursor];
		}
		return null;
	}

}
