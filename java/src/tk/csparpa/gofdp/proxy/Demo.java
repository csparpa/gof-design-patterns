package tk.csparpa.gofdp.proxy;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: Proxy pattern");
		AbstractSubject proxy = new Proxy("test.txt",
										  Arrays.asList("bob","mark","fred"));
		System.out.println(proxy.getContent());
		System.out.println(proxy.getLine(47));
		proxy.rename("alice", "test_1.txt");
		proxy.rename("fred", "test_1.txt");
	}
}
