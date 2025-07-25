package demo;

import java.lang.reflect.InvocationTargetException;

import custom_DI.Custom_IOC_Conatiner;

public class TestCFG {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Custom_IOC_Conatiner ioc= new Custom_IOC_Conatiner();
			ioc.intialize("demo");
			Car c=(Car)ioc.getbean(Car.class);
			c.Run();

	
	}
}
