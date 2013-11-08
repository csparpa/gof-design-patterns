package tk.csparpa.gofdp.chainofresponsibility.variants;

import java.util.Arrays;
import java.util.List;

public class MyRequestA extends Request {
	
	private String parameter1;
	private String parameter2;

	public MyRequestA(String parameter1, String parameter2) {
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
	}

	public List<String> getParameters() {
		return Arrays.asList(parameter1, parameter2);
	}
}
