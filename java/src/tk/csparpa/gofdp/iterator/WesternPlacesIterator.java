package tk.csparpa.gofdp.iterator;

/**
 * Implements Iterator interface and iterates only over places in the Aggregate
 * that have negative longitude (west of Greenwich). This implementation does
 * not rely on Aggregate copies.
 */
public class WesternPlacesIterator implements Iterator {

	private ConcreteAggregate iterable;
	private int currentIndex;

	public WesternPlacesIterator(ConcreteAggregate iterable) {
		this.iterable = iterable;
		this.currentIndex = findFirstWesternPlace();
	}
	
	private int findFirstWesternPlace(){
		for (int index = 0; index < iterable.size(); index++) {
			Place place = (Place) iterable.getPlaceAtPosition(index);
			if(isWestern(place)){
				return index;
			}
		}
		return -1;
	}
	
	@Override
	public Object first() {
		if(currentIndex == -1){
			return null;
		}
		return iterable.getPlaceAtPosition(currentIndex);

	}

	@Override
	public Object next() {
		if(currentIndex == -1){
			return null;
		}
		Place result = iterable.getPlaceAtPosition(currentIndex);
		currentIndex = findNextWesternPlace();
		return result;
	}

	@Override
	public boolean hasMore() {
		Object item = iterable.getPlaceAtPosition(currentIndex);
		if(item == null){
			return false;
		}
		return true;
	}
	
	private boolean isWestern(Place place){
		if(place.getLongitude() < 0.0){
			return true;
		}
		return false;
	}
	
	private int findNextWesternPlace(){
		for (int index = currentIndex + 1; index < iterable.size(); index++) {
			Place place = (Place) iterable.getPlaceAtPosition(index);
			if(isWestern(place)){
				return index;
			}
		}
		return -1;
	}
}
