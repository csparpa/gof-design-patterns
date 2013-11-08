package tk.csparpa.gofdp.chainofresponsibility.variants;

import java.util.List;

public class ConcreteHandlerB extends Handler {
	
	@Override
	public void handleRequest(Request request) {
		if(request instanceof MyRequestB){
			List<String> params = ((MyRequestB) request).getParameters();
			System.out.println("Request parameters are: " + params.get(0) + 
					". Chain stops here.");
			return;
		}
		System.out.println("Don't know what to do... rising exception!");
		throw new RuntimeException("The Request subtype is not fulfillable.");
	}
}
