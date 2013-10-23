package tk.csparpa.gofdp.prototype;

/**
 * This class provides the abstract interface for object prototyping, consisting
 * in just a clone operaton. The class implements the java.lang.Cloneable 
 * interface, which marks this type as cloneable using the clone() method of 
 * the Object ancestral class.
 */
public abstract class AbstractPrototype implements Cloneable{
	
	/**
	 * This is the clone operation to be implemented by concrete subclass protypes
	 */
	public abstract AbstractPrototype clone() throws CloneNotSupportedException;
	
	/**
	 * An operation. Modify it or add yours!
	 */
	public abstract void greet();
}