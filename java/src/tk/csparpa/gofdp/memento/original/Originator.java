package tk.csparpa.gofdp.memento.original;

public class Originator {
	
	private String state;
	
	public Originator(String state){
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String newState){
		state = newState;
	}
	
	public Memento saveState(){
		return new Memento(state);
	}
	
	public void restoreState(Memento memento){
		this.state = memento.getState();
	}
	
	public void greet(){
		System.out.println("My state is: " + state);
	}
}
