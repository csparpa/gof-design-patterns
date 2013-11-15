package tk.csparpa.gofdp.interpreter;

public class ConstantExpression implements AbstractExpression {

	private boolean value;
	
	public ConstantExpression(boolean value) {
		this.value = value;
	}
	
	@Override
	public boolean interpret(Context context) {
		return value;
	}	
}
