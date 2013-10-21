package tk.csparpa.gofdp.singleton;

public class Monostate {
	
	//Shared state among Monostate instances
	private static String state;
	
	/**
	 * Public constructor used to obtain instances of Monostate, all sharing
	 * the same state
	 */
	public Monostate(){
		Monostate.state = "stateX";
	}
	
	public String getState() {
	    return Monostate.state;
	}
	
	/**
	 * This method returns the Monostate shared state. The method is synchronized,
	 * because the state should be modified atomically.
	 */
	public synchronized void setState(String state) {
	    Monostate.state = state;
	}
}
