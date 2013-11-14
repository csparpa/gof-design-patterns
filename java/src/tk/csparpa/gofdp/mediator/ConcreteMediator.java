package tk.csparpa.gofdp.mediator;

import java.util.List;

public class ConcreteMediator implements Mediator {
	
	private List<Colleague> team;
	private List<Colleague> all;
	public ConcreteMediator(List<Colleague> team, List<Colleague> all) {
		this.team = team;
		this.all = all;
	}
	
	@Override
	public void teamGreet() {
		System.out.println("Mediator will ask team members to greet");
		for (Colleague colleague : team) {
			colleague.teamGreet();
		}
	}
	
	@Override
	public void broadcastGreet() {
		System.out.println("Mediator will ask everyone to greet");
		for (Colleague colleague : all) {
			colleague.greet();
		}
	}
}
