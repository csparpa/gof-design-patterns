package tk.csparpa.gofdp.interpreter;

public class VariableExpression implements AbstractExpression {
	
	private String name;
	
	public VariableExpression(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public boolean interpret(Context context) {
		return context.lookup(name);
	}
}
