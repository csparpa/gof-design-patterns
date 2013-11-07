package tk.csparpa.gofdp.state;

/**
 * Abstract interface that encapsulates the behaviour related to the state of
 * a context. In this example, concrete State instances are implemented as 
 * flyweights.
 */
public abstract class State {
	
	public abstract void stage(Context context);
	
	public abstract void unstage(Context context);
	
	public abstract void commit(Context context);
}
