package tk.csparpa.gofdp.facade;

import java.util.Calendar;

/**
 * This is the concrete implementation of the abstract façade interface. This
 * class knows the interfaces of the subsystem classes and invokes them
 */
public class ConcreteFacade implements AbstractFacade {

	private AbstractSubsystemModule1 module1;
	private AbstractSubsystemModule2 module2;
	
	public ConcreteFacade(AbstractSubsystemModule1 module1,
						AbstractSubsystemModule2 module2) {
		this.module1 = module1;
		this.module2 = module2;
	}

	@Override
	public void greet() {
		String name = this.module1.getName();
		int birth = this.module1.getYearOfBirth();
		int age = this.module2.computeAge(this.module1, 
									Calendar.getInstance().get(Calendar.YEAR));
		String message = "Hello, my name is " + name + ", I was born in " +
				Integer.toString(birth) + " and therefore I am " + 
				Integer.toString(age);
		System.out.println(message);
	}
}
