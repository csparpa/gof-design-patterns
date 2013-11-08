package tk.csparpa.gofdp.command;

/**
 * Concrete implementation for Command, realizing a multiplication. 
 */
public class MultiplyCommand implements Command {
	
	private Multiplier multiplier;
	
	public MultiplyCommand(Multiplier multiplier){
		this.multiplier = multiplier;
	}

	@Override
	public int execute(int number) {
		return multiplier.times(number);
	}
}
