package tk.csparpa.gofdp.flyweight;

/**
 * Abstract interface for flyweight instances. Please notice how the "external
 * state" - that is, the operational context - is passed as a parameter to the
 * flyweights
 */
public abstract class AbstractFlyweight {
	
	public abstract void greet(String externalState);
	
	public abstract String getSharedState();
}
