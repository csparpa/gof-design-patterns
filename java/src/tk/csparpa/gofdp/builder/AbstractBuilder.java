package tk.csparpa.gofdp.builder;

/**
 * 
 * This is the abstract interface for creating parts of a complex product.
 *
 */
public interface AbstractBuilder {
	
	/**
	 * 
	 * Builds part A of the product
	 */
	public void buildPartA();

	/**
	 * 
	 * Builds part B of the product
	 */
	public void buildPartB();
	
	/**
	 * 
	 * Returns the complete instance of the product
	 */
	public Product getProduct();

}
