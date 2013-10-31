package tk.csparpa.gofdp.templatemethod;

/**
 * Concrete implementation for AbstractClass. This class implements the primitive
 * operations needed by the template method
 */
public class ConcreteClassA extends AbstractClass {
	
	private int nSteps;
	
	public ConcreteClassA(int nSteps){
		this.nSteps = nSteps;
	}

	@Override
	protected double[] partition(double lowerBoundary, double upperBoundary) {
		double[] partition = new double[this.nSteps+1];
		double amplitude = (upperBoundary - lowerBoundary)/this.nSteps;
		double point = lowerBoundary;
		int place = 0;
		while(point < upperBoundary){
			partition[place] = point;
			point += amplitude;
			place++;
		}
		partition[place] = upperBoundary;
		return partition;
	}

	//This implementation uses the trapezoidal-rule formula
	@Override
	protected double integrateNumerically(double[] partition) {
		double integral = 0.0;
		double step = partition[1] - partition[0];
		for (int i = 0; i < partition.length-1; i++) {
			integral += 
				(partition[i]*partition[i] + partition[i+1]*partition[i+1])*step/2;
		}
		return integral;
	}
}
