package tk.csparpa.gofdp.mediator;

public abstract class Colleague {
	
	protected Mediator mediator;
	protected String name;

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void introduceTheTeam(){
		// Does nothing
	}
	
	public void introduceEveryone(){
		// Does nothing
	}
	
	public void teamGreet(){
		System.out.println("Hi I am team member: " + name);
	}
	
	public void greet(){
		System.out.println(name);
	}
}
