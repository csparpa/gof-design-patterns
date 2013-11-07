package tk.csparpa.gofdp.state;

/**
 * This class represents the context whose states can be changed. In our example,
 * this class models a document with regards to a version-control system: a
 * document is at first unversioned, then it can be staged/added for
 * commitment (this operation can be rolled-up), then it can be committed. Once
 * a document is committed, it can only be moved to the unversioned state.
 */
public class Context {
	
	private State state;
	private StateFactory stateFactory;
	private String name;
	
	public Context(String name, StateFactory factory){
		this.name = name;
		this.stateFactory = factory;
		this.state = stateFactory.getState("unversioned");
	}
	
	public void add(){
		this.state.stage(this);
		this.state.commit(this);
	}
	
	public void revert(){
		this.state.unstage(this);
	}
	
	public String getName(){
		return this.name;
	}
		
	public void setState(String type){
		this.state = stateFactory.getState(type);
	}
}
