package tk.csparpa.gofdp.facade;

/**
 * Concrete implementation of AbstractSubsystemModule2
 */
public class SubsystemClass2 implements AbstractSubsystemModule2 {

	public SubsystemClass2() {}

	@Override
	public int computeAge(AbstractSubsystemModule1 module, int currentYear) {
		return currentYear - module.getYearOfBirth();
	}
}
