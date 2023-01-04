package com.factory;

public class MotorBikeFactory implements VehicleFactory {

	@Override
	public Vehicle create() {
		return new MotorBike() ;
	}
}
