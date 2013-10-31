package tk.csparpa.gofdp.strategy;

import java.util.List;

/**
 * This class stores a reference to a Strategy instance, given by the clients.
 * The clients talk to this class in order to execute algorithms and the class
 * defers this execution to the bound Strategy object
 */
public class Context {
	
	private Strategy strategy;
	private List<Integer> numbers;
	
	public Context(Strategy strategy, List<Integer> numbers){
		this.strategy = strategy;
		this.numbers = numbers;
	}
	
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	
	public int getMinimum(){
		return strategy.findMinimum(numbers);
	}
}
