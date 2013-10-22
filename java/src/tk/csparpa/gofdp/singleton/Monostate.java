package tk.csparpa.gofdp.singleton;

/**
 * This class is instantiable multiple times and each instance will share the
 * same predefined state with all the other instances: this is the Monostate
 * pattern.
 */
public class Monostate {
	
	//Shared state among Monostate instances
	private static String state;
	
	/**
	 * Public constructor used to obtain instances of Monostate, all sharing
	 * the same state
	 */
	public Monostate(){
		Monostate.state = "X";
	}
	
	/**
	 * This method returns the Monostate shared state. The method is synchronized,
	 * because the state should be modified atomically.
	 */
	public synchronized void setState(String state) {
	    Monostate.state = state;
	}
	
	public void greet(){
		System.out.println("Hi I am a Monostate with state "+Monostate.state);
	}
}
