package tk.csparpa.gofdp.templatemethod;

/**
 * Abstract class carrying the template method
 */
public abstract class AbstractClass {
	
	/**
	 * This is the template method. In our example, it sketches the algorithm
	 * for calculating the integral of function y=x^2  in the interval
	 * [lowerBound - upperBound] and  using a partition of nSteps sub-intervals.
	 */
	public final double doIntegrateParabola(double lowerBoundary,
											double upperBoundary){
		if(!validIntegrationInterval(lowerBoundary, upperBoundary)){
			throw new IllegalArgumentException("Wrong boundaries");
		}
		double[] partition = partition(lowerBoundary,upperBoundary);
		return integrateNumerically(partition);
	}
	
	private boolean validIntegrationInterval(double lowerBoundary, double upperBoundary){
		if(lowerBoundary <= upperBoundary){
			return true;
		}
		return false;
	}
	
	/**
	 * The following two methods are the primitive operations that shall be
	 * redefined by subclasses
	 */
	protected abstract double[] partition(double lowerBoundary, double upperBoundary);
	protected abstract double integrateNumerically(double[] partition);
	
}
