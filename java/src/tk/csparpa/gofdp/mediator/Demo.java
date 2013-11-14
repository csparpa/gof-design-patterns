package tk.csparpa.gofdp.mediator;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: Mediator pattern");
		System.out.println("Creating: three ConcreteColleagues - Tom, Linda and Joe");
		Colleague colleagueA = new ConcreteColleagueA("Tom", null);
		Colleague colleagueB = new ConcreteColleagueB("Linda", null);
		Colleague colleagueC = new ConcreteColleagueC("Joe", null);
		System.out.println("Creating: team with Linda and Joe");
		List<Colleague> team = Arrays.asList(colleagueB, colleagueC);
		List<Colleague> all = Arrays.asList(colleagueA, colleagueB, colleagueC);
		System.out.println("Creating: Mediator instance");
		Mediator mediator = new ConcreteMediator(team, all);
		colleagueA.setMediator(mediator);
		colleagueB.setMediator(mediator);
		colleagueC.setMediator(mediator);
		System.out.println("Asking: Linda to introduce everyone");
		colleagueB.introduceEveryone();
		System.out.println("Asking: Tom to introduce the team");
		colleagueA.introduceTheTeam();
	}
}
