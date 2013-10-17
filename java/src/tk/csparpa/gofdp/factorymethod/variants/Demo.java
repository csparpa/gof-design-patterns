package tk.csparpa.gofdp.factorymethod.variants;

import tk.csparpa.gofdp.factorymethod.AbstractProduct;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: base implementation for factory method");
		CreatorBaseImplementation simpleCreator =
				new CreatorBaseImplementation();
		AbstractProduct product1 = simpleCreator.factoryMethod();
		product1.feature();
		
		System.out.println("");
		
		System.out.println("***Demo: extending factory method's base"
				+ " implementation");
		CreatorBaseImplementation extendedCreator = 
				new CreatorBaseImplementation() {
					//Override of class CreatorBaseImplementation
					@Override
					public AbstractProduct newAbstractProduct(){
						System.out.println("Called: extended base implementation"
								+ " for template method");
						
						//Override of class AbstractProduct
						return new AbstractProduct(){
							public void feature(){
								System.out.println("Called: my product feature");
							}
						};
							
					};
				};
		AbstractProduct product2 = extendedCreator.factoryMethod();
		product2.feature();
		
		System.out.println("");
		
		System.out.println("***Demo: parametric factory method");
		ParametricCreator parametricCreator = new ParametricCreator();
		AbstractProduct product3 = 
				parametricCreator.factoryMethod("ConcreteProduct");
		product3.feature();
	}

}
