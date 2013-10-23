package tk.csparpa.gofdp.adapter;

import java.util.List;

/**
 * This is the interface that the clients expect. Therefore, the Adaptee class
 * must be adapted to this interface in order to be re-used by clients.
 */
public interface TargetInterface {
	
	public List<Double> getOperands();
	
	public double sum();
	
	public double max();
	
	/**
	 * This operation is not among Adaptee's ones
	 */
	public double multiply();
}
