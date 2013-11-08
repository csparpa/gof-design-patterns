package tk.csparpa.gofdp.chainofresponsibility;

/**
 * Abstract interface for requests handling. Please notice that a "successor"
 * field is used to point to the next Handler in the chain
 */
public abstract class Handler {
	
	protected Handler successor;
	
	public void setSuccessor(Handler handler){
		this.successor = handler;
	}
	
	public abstract void handleRequest(int number);
}
