package tk.csparpa.gofdp.factorymethod.variants;

import tk.csparpa.gofdp.factorymethod.AbstractProduct;
import tk.csparpa.gofdp.factorymethod.ConcreteProduct;

/**
 * 
 * This concrete class is an alternative to the usage of the hierarchy: abstract 
 * creator class + concrete creator class. This class provides a base 
 * implementation for the template method, that is  encapsulated into a separate
 * method so that subclasses can overwrite it, if they need so.
 *
 */

public class CreatorBaseImplementation {
	
	/**
	 * Factory method calling a separate method implementing object creation 
	 * @return AbstractProduct
	 */
	public AbstractProduct factoryMethod(){
		return newAbstractProduct();
	}
	
	/**
	 * This method is the one to be modified (if needed) by subclasses. Modify
	 * it if you want to return concrete implementations of AbstractProduct
	 * other than ConcreteProduct!
	 * @return AbstractProduct
	 */
	public AbstractProduct newAbstractProduct(){
		System.out.println("Called: basic implementation of template method that "
				+ "may be overridden");
		return new ConcreteProduct();
	}

}
