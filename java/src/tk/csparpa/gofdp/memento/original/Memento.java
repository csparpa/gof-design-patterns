package tk.csparpa.gofdp.memento.original;

public class Memento {
	
	private String state;
	
	public Memento(String state){
		this.state = state;
	}
	
	protected String getState(){
		return state;
	}
	
	protected void setState(String state){
		this.state = state;
	}
}
