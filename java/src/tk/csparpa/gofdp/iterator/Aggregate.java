package tk.csparpa.gofdp.iterator;

/**
 * Abstract interface for composite objects that must be iterated, providing the
 * factory method for creating Iterators.
 */
public interface Aggregate {
	
	public Iterator iterator(String type);
}
