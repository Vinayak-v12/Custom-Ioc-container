package demo;

import custom_DI.Custom_Autowired;
import custom_DI.Custom_Component;

@Custom_Component
public class Car {
	
	@Custom_Autowired
	private Engine engine;
	
	public void Run() {
		engine.start();
		System.out.println("car is Running");
	}

}
