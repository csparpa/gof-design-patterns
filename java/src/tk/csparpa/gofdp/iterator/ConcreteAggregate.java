package tk.csparpa.gofdp.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements an iterable type and adheres to the Aggregate interface.
 * The class represents a travel around the world with many Places visited.
 */
public class ConcreteAggregate implements Aggregate {
	
	private List<Place> items;
	
	public ConcreteAggregate(){
		items = new ArrayList<Place>();
	}
	
	public ConcreteAggregate(List<Place> places){
		items = new ArrayList<Place>(places);
	}
	
	public Place getPlaceAtPosition(int position){
		try{
			return items.get(position);
		}
		catch(Exception e){
			return null;
		}
	}
	
	public int size(){
		return items.size();
	}

	/**
	 * Implementation of the factory method. It can be further refined with the
	 * 
	 */
	@Override
	public Iterator iterator(String type) {
		if(type.equals("plain")){
			return new ConcreteIterator(this);
		}
		if(type.equals("western")){
			return new WesternPlacesIterator(this);
		}
		else { //default
			return new ConcreteIterator(this);
		}		
	}
}
