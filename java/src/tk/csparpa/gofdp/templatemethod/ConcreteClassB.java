package tk.csparpa.gofdp.templatemethod;

/**
 * Concrete implementation for AbstractClass. This class implements the primitive
 * operations needed by the template method
 */
public class ConcreteClassB extends ConcreteClassA {

	public ConcreteClassB(int nSteps) {
		super(nSteps);
	}
	
	//This implementation uses the midpoint-rule formula
	@Override
	protected double integrateNumerically(double[] partition) {
		double integral = 0.0;
		double step = partition[1] - partition[0];
		for (int i = 0; i < partition.length-1; i++) {
			integral += step*Math.pow(2, (partition[i]+partition[i+1])/2); 
				
		}
		return integral;
	}
}
