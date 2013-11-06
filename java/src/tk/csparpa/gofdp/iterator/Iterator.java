package tk.csparpa.gofdp.iterator;

/**
 * Minimal abstract interface for iterators
 */
public interface Iterator {
	
	public Object first();
	
	public Object next();
	
	public boolean hasMore();
}
