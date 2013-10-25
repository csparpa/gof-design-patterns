package tk.csparpa.gofdp.decorator;

/**
 * Concrete implementation for AbstractComponent interface
 */
public class ConcreteComponent implements AbstractComponent {
	
	private String name;
	private int age;
	
	public ConcreteComponent(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getAge() {
		return this.age;
	}
}
