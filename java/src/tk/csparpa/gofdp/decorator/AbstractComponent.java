package tk.csparpa.gofdp.decorator;

/**
 * The abstract interface of the components that will be decorated. This interface
 * is implemented by all Decorator subtypes.
 *
 */
public interface AbstractComponent {
	
	public String getName();
	
	public int getAge();
}
