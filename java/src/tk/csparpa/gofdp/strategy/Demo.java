package tk.csparpa.gofdp.strategy;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: pattern Strategy");
		System.out.println("Numbers list: [5,8,1,14,3]");
		List<Integer> numbers = Arrays.asList(5,8,1,14,3);
		System.out.println("Creating: Strategy object of type A");
		Strategy strategyA = new ConcreteStrategyA();
		System.out.println("Creating: Context object with strategy type A");
		Context context = new Context(strategyA, numbers);
		System.out.println("Calling: algorithmic operation");
		System.out.println("Minimum is: "+Integer.toString(context.getMinimum()));
		System.out.println("Modifying: Context with a new Strategy object of type B");
		context.setStrategy(new ConcreteStrategyB());
		System.out.println("Calling: algorithmic operation");
		System.out.println("Minimum is: "+Integer.toString(context.getMinimum()));
	}
}
