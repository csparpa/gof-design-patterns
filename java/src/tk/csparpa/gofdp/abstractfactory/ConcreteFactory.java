package tk.csparpa.gofdp.abstractfactory;

/**
 * Concrete implementation for AbstractFactory class: this class implements the
 * creational methods for all the products of a specific family
 */
public class ConcreteFactory implements AbstractFactory {

	@Override
	public AbstractProductX createProductX() {
		System.out.println("Called: implementation of abstract factory; "
				+ "will return: ConcreteProductX instance");
		return new ConcreteProductX();
	}

	@Override
	public AbstractProductY createProductY() {
		System.out.println("Called: implementation of abstract factory; "
				+ "will return: ConcreteProductY instance");
		return new ConcreteProductY();
	}
}
