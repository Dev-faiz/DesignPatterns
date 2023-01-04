package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import controller.TestController;

public class Main {
	
	/*
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		try( var c = new AnnotationConfigApplicationContext(ProjectConfig.class) ){
			
			
			var c1 = c.getBean("testController"  , TestController.class);
			var c2 = c.getBean("testController"  , TestController.class);
//			var c3 = c.getBean("demoController3"  , TestController.class);
//			var c4 = c.getBean("demoController4"  , TestController.class);
//			
			System.out.println(c1);// same references
			System.out.println(c2); // same references
//			System.out.println(c3);
//			System.out.println(c4);
			
			
		}
	}

}
 