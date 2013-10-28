package tk.csparpa.gofdp.proxy;

/**
 * Abstract interface for either proxies and represented objects
 */
public abstract class AbstractSubject {
	
	public abstract String getContent();
	
	public abstract String getLine(int lineNumber);
	
	public abstract void rename(String username, String newName);
}
