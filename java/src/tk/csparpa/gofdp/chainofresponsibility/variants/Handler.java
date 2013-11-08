package tk.csparpa.gofdp.chainofresponsibility.variants;

import tk.csparpa.gofdp.chainofresponsibility.variants.Handler;

public abstract class Handler {

	protected Handler successor;
	
	public void setSuccessor(Handler handler){
		this.successor = handler;
	}
	
	public abstract void handleRequest(Request request);
}
