package com.main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

import com.factory.CarFactory;
import com.factory.carEnum.CarType;

public class Main {
	
	public static void main(String[] args) {
		
		var c1 = CarFactory.create( CarType.AUDI ) ;
		System.out.println(c1);
		
		var c2 = CarFactory.create( CarType.BMW ) ;
		System.out.println(c2);
		
		LocalDate.now(); // example of factory pattern 
		Path path = Paths.get( "C:\\Desktop"); // example of factory pattern 
		
		System.out.println(path.getClass());
		
		
	}

}
