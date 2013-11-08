package tk.csparpa.gofdp.chainofresponsibility;

/**
 * Concrete implementation for Handler, handling negative numbers
 */
public class NegativeHandler extends Handler {
		
	@Override
	public void handleRequest(int number){
		if(number < 0){
			System.out.println("The number " + Integer.toString(number) + 
					" is negative. Chain stops here");
			return;
		}
		System.out.println("Don't know what to do... yielding the request to "
				+ "the next one in the chain");
		this.successor.handleRequest(number);
	}
}
