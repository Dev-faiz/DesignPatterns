package com.main;

import com.factory.Vehicle;
import com.factory.VehicleFactory;

public class Main {
	
	public static void main(String[] args) {
		
		
	
		VehicleFactory carFactory = VehicleFactory.create( VehicleFactory.VehicleType.CAR );
			Vehicle car =   carFactory.create();
			System.out.println(car.getClass());
			
		VehicleFactory bikeFactory = VehicleFactory.create( VehicleFactory.VehicleType.MOTORBIKE );
			Vehicle bike =   bikeFactory.create();
			System.out.println(bike.getClass());
		
			/*
			 
			 real world example  
			 
			  EntityManagerFactory  entityManagerFactory = Persistence.createManagerFactory() ;
			  EntityManager  entityManager = entityManagerFactory.createEntityManager() ; 
			  
			  */ 
		
	}

}
