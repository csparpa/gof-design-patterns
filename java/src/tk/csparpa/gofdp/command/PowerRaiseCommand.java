package tk.csparpa.gofdp.command;

/**
 * Concrete implementation for Command, realizing a power raising. 
 */
public class PowerRaiseCommand implements Command {

	private PowerRaiser powerRaiser;
	
	public PowerRaiseCommand(PowerRaiser powerRaiser){
		this.powerRaiser = powerRaiser;
	}

	@Override
	public int execute(int number) {
		return powerRaiser.raise(number);
	}
}
