package tk.csparpa.gofdp.iterator;

public class ConcreteIterator implements Iterator {
	
	private ConcreteAggregate iterable;
	private int currentIndex;

	public ConcreteIterator(ConcreteAggregate iterable) {
		this.iterable = iterable;
		currentIndex = 0;
	}

	@Override
	public Object first() {
		return iterable.getPlaceAtPosition(0);
	}

	@Override
	public Object next() {
		Place result = iterable.getPlaceAtPosition(currentIndex);
		currentIndex++;
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
}
