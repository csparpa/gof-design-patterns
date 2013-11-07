package tk.csparpa.gofdp.state;

public class CommittedState extends State {

	public CommittedState() {}
	
	@Override
	public void stage(Context context) {
		// does nothing!		
	}

	@Override
	public void unstage(Context context) {
		removeFromRepository(context.getName());
		//next stage is: UnversionedState
		context.setState("unversioned");	
	}

	@Override
	public void commit(Context context) {
		// does nothing!
	}
	
	private void removeFromRepository(String name){
		System.out.println("Document "+ name + " removed from repository");
	}
}
