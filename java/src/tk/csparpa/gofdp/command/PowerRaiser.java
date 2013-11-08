package tk.csparpa.gofdp.command;

/**
 * A Receiver implementing power rising by a fixed exponent.
 */
public class PowerRaiser {
	
	private int power;
	
	public PowerRaiser(int power){
		this.power = power;
	}

	public int raise(int number) {
		System.out.println("Rising "+ Integer.toString(number) + " to power " +
				Integer.toString(power));
		return (int)Math.pow(number, power);
	}
}
