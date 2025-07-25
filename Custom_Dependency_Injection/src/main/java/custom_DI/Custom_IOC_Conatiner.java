package custom_DI;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;

public class Custom_IOC_Conatiner {
	
	
	// Acts like a container to store objects of respective classes 
	private Map<Class<?>,Object> Class_obj_map= new HashMap<>();
	
	
	public void intialize(String Packagename) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, SecurityException {

		
		
		Reflections reflections= new Reflections(Packagename);
		Set<Class<?>>	classes	=reflections.getTypesAnnotatedWith(Custom_Component.class);
		
		
		// to iterate through all the Classes in the List
		for (Class<?> class1 : classes) {
			
			if(class1.isAnnotationPresent(Custom_Component.class)) {
				
				Object obj	=class1.getDeclaredConstructor().newInstance();//using reflection to create object
				Class_obj_map.put(class1, obj);
					
			}
			
		}
		
		
		for(Object obj:Class_obj_map.values()) {
			
			for (Field field  : obj.getClass().getDeclaredFields()) {
				
				if(field.isAnnotationPresent(Custom_Autowired.class)) {
					
					field.setAccessible(true);//for accesssing private fields
					
					
					Class<?> class_type	=field.getType();
					
					Object object	=Class_obj_map.get(class_type);
					field.set(obj,object);
				
				}
				
			}
		}
		
	}
	public Object getbean(Class<?> class1 ) {
		 return Class_obj_map.get(class1);
	}

}
