package tk.csparpa.gofdp.bridge;

/**
 * The abstract interface for the abstraction that must be able to vary 
 * indipendently from the correspondent implementation
 */
public abstract class Abstraction {
	
	public abstract void greet();
	
	public abstract void setImplementor(Implementor implementor);
}
