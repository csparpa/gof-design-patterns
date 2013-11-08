package tk.csparpa.gofdp.command;

/**
 * A Receiver implementing multiplications by a fixed operand.
 */
public class Multiplier {
	
	private int multiplier;
	
	public Multiplier(int multiplier){
		this.multiplier = multiplier;
	}
	
	public int times(int number){
		System.out.println("Multiplying "+ Integer.toString(number) + " by " +
				Integer.toString(multiplier));
		return multiplier*number;
	}
}
