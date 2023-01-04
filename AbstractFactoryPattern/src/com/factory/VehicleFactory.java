package com.factory;

public interface VehicleFactory  {
	
	Vehicle create();
	
	public static VehicleFactory create( VehicleType vehicleType) {
		
		switch(vehicleType) {
		
			case CAR : return new CarFactory() ;
			case MOTORBIKE : return new MotorBikeFactory(); 
			
		}
		throw new IllegalArgumentException() ; 
	}
	
	enum VehicleType{
		
		CAR , MOTORBIKE
	}

}
