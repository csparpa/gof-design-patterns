package tk.csparpa.gofdp.chainofresponsibility.variants;

import java.util.List;

import tk.csparpa.gofdp.chainofresponsibility.variants.Handler;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: Chain of Responsibility pattern with "
				+ "polimorphic requests");
		System.out.println("Creating: Handler objects");
		Handler first = new ConcreteHandlerA();
		Handler second = new ConcreteHandlerB();
		System.out.println("Creating: chain of Handler objects");
		first.setSuccessor(second);
		System.out.println("Testing: chain with Request of type MyRequestA");
		Request myRequestA = new MyRequestA("hello", "world");
		first.handleRequest(myRequestA);
		System.out.println("Testing: chain with Request of type MyRequestB");
		Request myRequestB = new MyRequestB("cheers");
		first.handleRequest(myRequestB);
		System.out.println("Testing: chain with Request of a new subtype - "
				+ "expecting that an Exception will be thrown");
		Request myRequestC = new Request() {
			@Override
			public List<String> getParameters() {
				return null;
			}
		};
		first.handleRequest(myRequestC);
	}
}
