package tk.csparpa.gofdp.factorymethod;

import tk.csparpa.gofdp.factorymethod.AbstractCreator;
import tk.csparpa.gofdp.factorymethod.ConcreteCreator;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: factory method pattern");
		AbstractCreator factory = new ConcreteCreator();
		AbstractProduct product = factory.factoryMethod();
		product.feature();
	}

}
