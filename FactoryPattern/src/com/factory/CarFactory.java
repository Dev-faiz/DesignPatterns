package com.factory;

import com.factory.car.AUDI;
import com.factory.car.BMW;
import com.factory.carEnum.CarType;

public class CarFactory {
	
	public static Vehicle create( CarType carType ) {
		
		switch ( carType ) {
		case AUDI: return new AUDI();
		case BMW : return new BMW(); 
		
		}
		throw new IllegalArgumentException("Unexpected value: " +  carType );
		
	}

}
