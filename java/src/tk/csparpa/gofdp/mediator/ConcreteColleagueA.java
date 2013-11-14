package tk.csparpa.gofdp.mediator;

public class ConcreteColleagueA extends Colleague {
	
	public ConcreteColleagueA(String name, Mediator mediator){
		this.name = name;
		this.mediator = mediator;
	}
	
	@Override
	public void introduceTheTeam(){
		teamUpdate();
	}
	
	private void teamUpdate(){
		mediator.teamGreet();
	}
}
