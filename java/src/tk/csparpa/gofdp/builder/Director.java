package tk.csparpa.gofdp.builder;

/**
 * 
 * This class is used by the clients to create new Product instances by using
 * an AbstractBuilder object.
 *
 */
public class Director {
	
	private AbstractBuilder builder;
	
	public Director(AbstractBuilder builder){
		this.builder = builder;
	}
	
	/**
	 * 
	 * This method builds the whole new Product instance. The creation
	 * of the single parts is delegated to the AbstractBuilder instance, as
	 * well as the provisioning of the instance
	 */
	public Product construct(){
		this.builder.buildPartA();
		this.builder.buildPartB();
		return this.builder.getProduct();
	}
}
