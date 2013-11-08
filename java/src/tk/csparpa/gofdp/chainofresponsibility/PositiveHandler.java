package tk.csparpa.gofdp.chainofresponsibility;

/**
 * Concrete implementation for Handler, handling positive numbers
 */
public class PositiveHandler extends Handler {
	
	@Override
	public void handleRequest(int number){
		if(number > 0){
			System.out.println("The number " + Integer.toString(number) + 
					" is positive. Chain stops here");
			return;
		}
		System.out.println("Don't know what to do... yielding the request to "
				+ "the next one in the chain");
		this.successor.handleRequest(number);
	}
}
