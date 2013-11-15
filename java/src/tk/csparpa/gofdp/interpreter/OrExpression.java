package tk.csparpa.gofdp.interpreter;

public class OrExpression implements AbstractExpression {

	AbstractExpression operand1, operand2;
	
	public OrExpression(AbstractExpression operand1, AbstractExpression operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	@Override
	public boolean interpret(Context context) {
		return operand1.interpret(context) || operand2.interpret(context);
	}
}
