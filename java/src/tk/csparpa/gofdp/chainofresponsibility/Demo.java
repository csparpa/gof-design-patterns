package tk.csparpa.gofdp.chainofresponsibility;

public class Demo {
	
	public static void main(String[] args){
		System.out.println("***Demo: Chain of Responsibility pattern");
		System.out.println("Creating: Handler objects");
		Handler first = new NegativeHandler();
		Handler second = new PositiveHandler();
		Handler third = new ZeroHandler();
		System.out.println("Creating: chain of Handler objects");
		first.setSuccessor(second);
		second.setSuccessor(third);
		System.out.println("Testing: chain with input=-2");
		first.handleRequest(-2);
		System.out.println("Testing: chain with input=0");
		first.handleRequest(0);
		System.out.println("Testing: chain with input=2");
		first.handleRequest(2);
	}

}
