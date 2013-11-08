package tk.csparpa.gofdp.chainofresponsibility;

/**
 * Concrete implementation for Handler, handling zeroes.
 */
public class ZeroHandler extends Handler {
	@Override
	public void handleRequest(int number){
		if(number == 0){
			System.out.println("The number " + Integer.toString(number) + 
					" is zero. Chain stops here");
			return;
		}
		System.out.println("Don't know what to do... rising exception!");
		throw new IllegalArgumentException(); // will never be thrown...
	}
}
