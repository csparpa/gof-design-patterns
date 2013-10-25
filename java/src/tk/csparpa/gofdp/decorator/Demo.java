package tk.csparpa.gofdp.decorator;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: pattern Decorator");
		System.out.println("Creating: a ConcreteComponent with name=Bob, age=20");
		AbstractComponent component1 = new ConcreteComponent("Bob", 20);
		System.out.println("Decorating: with new state and behaviour regarding " +
				"job. Will be job=student");
		AbstractDecorator jobDecorator1 = 
				new ConcreteDecorator(component1, "student");
		System.out.println("Testing: behaviours of decorated component");
		System.out.println("name="+jobDecorator1.getName());
		System.out.println("age="+Integer.toString(jobDecorator1.getAge()));
		System.out.println("job="+jobDecorator1.getJob());

		System.out.println("");
		
		System.out.println("***Demo: pattern Decorator without abstract decorator class");
		
		/**
		 * This decorator class directly implements the AbstractComponent 
		 * interface instead of subclassing the AbstractDecorator class. This is
		 * useful if just one behaviour has to be quickly added to the decorated
		 * component.
		 */
		class NationalityDecorator implements AbstractComponent{

			private AbstractComponent decorated;
			private String nationality;

			public NationalityDecorator(AbstractComponent decorated,
										String nationality) {
				this.decorated = decorated;
				this.nationality = nationality;
			}

			@Override
			public String getName() {
				return this.decorated.getName();
			}

			@Override
			public int getAge() {
				return this.decorated.getAge();
			}
			
			/**
			 * New behaviour
			 */
			public String getNationality(){
				return this.nationality;
			}
		}
	
		System.out.println("Decorating: with new state and behaviour regarding " +
				"nationality. Will be nationality=japanese");
		NationalityDecorator nationalityDecorator1 = 
				new NationalityDecorator(component1, "japanese");
		System.out.println("Testing: behaviours of decorated component");
		System.out.println("name="+nationalityDecorator1.getName());
		System.out.println("age="+Integer.toString(nationalityDecorator1.getAge()));
		System.out.println("nationality="+nationalityDecorator1.getNationality());		
	}
}
