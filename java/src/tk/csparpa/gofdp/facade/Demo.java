package tk.csparpa.gofdp.facade;

import java.util.Calendar;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: pattern Façade");
		System.out.println("Creating: subsystems module 1");
		AbstractSubsystemModule1 module1 = new SubsystemClass1("Jim", 1983);
		System.out.println("Creating: subsystems module 2");
		AbstractSubsystemModule2 module2 = new SubsystemClass2();
		System.out.println("Creating: concrete façade");
		AbstractFacade facade = new ConcreteFacade(module1, module2);
		System.out.println("Invoking: the behaviour stated in the façade");
		facade.greet();
		System.out.println("Invoking: the same behaviour as before but " + 
				"invoked without using the façade. It is much more complex!");
		String name = module1.getName();
		int birth = module1.getYearOfBirth();
		int age = module2.computeAge(module1, 
									Calendar.getInstance().get(Calendar.YEAR));
		String message = "Hello, my name is " + name + ", I was born in " +
				Integer.toString(birth) + " and therefore I am " + 
				Integer.toString(age);
		System.out.println(message);
	}

}
