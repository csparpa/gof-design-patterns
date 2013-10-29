package tk.csparpa.gofdp.flyweight;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: flyweight pattern");
		System.out.println("Creating: factory");
		FlyweightFactory factory = new FlyweightFactory();
		System.out.println("Creating: flyweights");
		AbstractFlyweight fly1 = new ConcreteFlyweight("concrete");
		
		class ShyFlyweight extends AbstractFlyweight{
			@Override
			public void greet(String externalState) {
				System.out.println("I am a shy flyweight");
			}

			@Override
			public String getSharedState() {
				return "shy";
			}
		};
		
		AbstractFlyweight fly2 = new ShyFlyweight();
		System.out.println("Registering: flyweights to the factory");
		factory.registerFlyweight("concrete",fly1);
		factory.registerFlyweight("shy",fly2);
		System.out.println("Obtaining: concrete flyweight");
		AbstractFlyweight flyweight = factory.getFlyweight("concrete");
		flyweight.greet("external state specified by the clients");
	}
}
