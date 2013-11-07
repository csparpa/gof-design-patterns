package tk.csparpa.gofdp.state;

public class UnversionedState extends State {
	
	public UnversionedState() {}

	@Override
	public void stage(Context context) {
		addToIndex(context.getName());
		//next stage is: StagedState
		context.setState("staged");
	}

	@Override
	public void unstage(Context context) {
		// does nothing!
	}

	@Override
	public void commit(Context context) {
		// does nothing!
	}
	
	private void addToIndex(String name){
		System.out.println("Document "+ name + " added to index");
	}
}
