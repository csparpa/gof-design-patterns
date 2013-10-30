package tk.csparpa.gofdp.bridge;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: bridge pattern with varying implementation");
		System.out.println("Creating: Abstraction instance with a reference to "
				+ "a default Implementor");
		Abstraction abstraction1 = new RefinedAbstraction();
		System.out.println("Calling: the Abstraction operation");
		abstraction1.greet();
		System.out.println("Creating: a new Implementor subclass instance");
		
		Implementor implementor = new Implementor() {
			@Override
			public String tellName() {
				return "mmmmh";
			}
			
			@Override
			public void openMouth() {
				System.out.println("Too lazy to open my mouth...");				
			}
		};
		
		System.out.println("Assigning: the new Implementor instance to the "
				+ "Abstraction instance");
		abstraction1.setImplementor(implementor);
		System.out.println("Calling: the Abstraction operation");
		abstraction1.greet();

		System.out.println("");
		System.out.println("***Demo: bridge pattern with varying abstraction");
		
		System.out.println("Creating: a new Abstraction subclass instance and "
				+ "assigning a reference to the old Implementor class instance "
				+ "to it");
		Abstraction abstraction2 = new Abstraction() {
			private Implementor implementor;
			
			@Override
			public void setImplementor(Implementor implementor) {
				this.implementor = implementor;
			}
			
			@Override
			public void greet() {
				System.out.println(implementor.tellName());
			}
		};
		System.out.println("Creating: a new Implementor subclass instance");
		abstraction2.setImplementor(implementor);
		System.out.println("Calling: the Abstraction operation");
		abstraction2.greet();
	}
}
