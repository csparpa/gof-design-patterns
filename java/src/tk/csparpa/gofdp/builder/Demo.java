package tk.csparpa.gofdp.builder;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: builder pattern");
		AbstractBuilder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		Product product = director.construct();
	}
}
