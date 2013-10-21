package tk.csparpa.gofdp.singleton;

/**
 * 
 * This class implements a Singleton.
 * Problems:
 *   1- getInstance() method must be somehow managed with regards to concurrent
 *      writes of the unique object instance (eg: locks, synchronization)
 *   2- it's easy to subclass the Singleton class but it's difficult to
 *      allow clients to obtain a unique instance of a specific subclass.
 */
public class Singleton {
	
	//The unique instance for the Singleton type
	private static Singleton instance;
	
	//Instance variables
	private String greet;
	
	/**
	 * Private constructor
	 */
	private Singleton(){
		this.greet = "Hello, I am a Singleton";
	};
	
	/**
	 * 
	 * This method returns the unique instance for Singleton type. The method
	 * is synchronized, so to prevent concurrency issues when the instance is
	 * still null and must therefore be created.
	 */
	public static synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public void greet(){
		System.out.println(instance.greet);
	}
}
