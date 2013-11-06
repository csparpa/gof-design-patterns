package tk.csparpa.gofdp.iterator;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: Iterator pattern");
		List<Place> places = Arrays.asList(new Place("New York", 40.47, -73.58),
										   new Place("Madrid", 40.26, -3.42),
										   new Place("Milan", 45.27, 9.10),
										   new Place("Paris", 48.48, 2.20),
										   new Place("Berlin", 52.30, 12.25),
										   new Place("Oslo", 59.57, 10.42));
		System.out.println("Creating: new ConcreteAggregate with places: Milano,"+
							   " Paris, Berlin, Oslo");
		Aggregate travel = new ConcreteAggregate(places);
		System.out.println("Creating: a ConcreteIterator");
		Iterator iterator1 = travel.iterator("plain");
		
		boolean hasMore = iterator1.hasMore();
		while(hasMore){
			System.out.println("Iterating: next place of our travel");
			((Place)iterator1.next()).describe();
			hasMore = iterator1.hasMore();
			System.out.println("Checking: more places to come? " + hasMore);
		}
		
		System.out.println("");
		
		System.out.println("Creating: a WesternPlacesIterator");
		Iterator iterator2 = travel.iterator("western");
		
		hasMore = iterator2.hasMore();
		while(hasMore){
			System.out.println("Iterating: next place of our travel");
			((Place)iterator2.next()).describe();
			hasMore = iterator2.hasMore();
			System.out.println("Checking: more places to come? " + hasMore);
		}
	}
}
