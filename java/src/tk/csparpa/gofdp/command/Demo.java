package tk.csparpa.gofdp.command;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: Command pattern");
		System.out.println("Creating: Command with a Multiplier "
				+ "instance as inner Receiver object");
		Multiplier multiplier = new Multiplier(3);
		Command multiplyByThree = new MultiplyCommand(multiplier);
		System.out.println("Creating: Command with a PowerRaiser "
				+ "instance as inner Receiver object");
		PowerRaiser powerRaiser = new PowerRaiser(2);
		Command square = new PowerRaiseCommand(powerRaiser);
		System.out.println("Invoking: multiplication command on number=7");
		System.out.println(Integer.toString(multiplyByThree.execute(7)));
		System.out.println("Invoking: power raising command on number=3");
		System.out.println(Integer.toString(square.execute(3)));
	}
}
