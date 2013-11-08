package tk.csparpa.gofdp.chainofresponsibility.variants;

import java.util.Arrays;
import java.util.List;

public class MyRequestB extends Request {
	
	private String parameter1;

	public MyRequestB(String parameter1) {
		this.parameter1 = parameter1;
	}

	public List<String> getParameters() {
		return Arrays.asList(parameter1);
	}
}
