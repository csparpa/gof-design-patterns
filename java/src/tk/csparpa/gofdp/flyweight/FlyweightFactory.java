package tk.csparpa.gofdp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * This factory prevents the clients from directly instantiating the flyweights.
 * Instead, it tracks down flyweights into an indexed data structure and returns
 * flyweights on-demand 
 */
public class FlyweightFactory {
	
	private Map<String, AbstractFlyweight> flyweights; 
	
	public FlyweightFactory(){
		this.flyweights = new HashMap<String, AbstractFlyweight>();
	}
	
	public void registerFlyweight(String key, AbstractFlyweight flyweight){
		if(!flyweights.containsValue(flyweight)){
			flyweights.put(key, flyweight);
		}
	}
	
	public AbstractFlyweight getFlyweight(String key){
		return flyweights.get(key);
	}
}
