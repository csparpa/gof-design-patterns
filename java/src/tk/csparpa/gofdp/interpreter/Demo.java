package tk.csparpa.gofdp.interpreter;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: Interpreter pattern");
		System.out.println("Boolean expression: (true AND p) OR (q AND NOT p)");
		System.out.println("Truth table:");
		System.out.println("P     Q     RESULT");
		System.out.println("------------------");
		System.out.println("true  true  true");
		System.out.println("true  false true");
		System.out.println("false true  true");
		System.out.println("false false false");
		System.out.println("");
		System.out.println("Building: syntax tree for the expression");
		VariableExpression p = new VariableExpression("p");
		VariableExpression q = new VariableExpression("q");
		AbstractExpression expression = new OrExpression(
				new AndExpression(new ConstantExpression(true),p),
				new AndExpression(q, new NotExpression(p))
		);		
		Context context = new Context();
		System.out.println("Evaluating expression with p=TRUE, q=TRUE");
		context.assign(p, true);
		context.assign(q, true);
		System.out.println(expression.interpret(context));
		System.out.println("Evaluating expression with p=TRUE, q=FALSE");
		context.assign(p, true);
		context.assign(q, false);
		System.out.println(expression.interpret(context));
		System.out.println("Evaluating expression with p=FALSE, q=TRUE");
		context.assign(p, false);
		context.assign(q, true);
		System.out.println(expression.interpret(context));
		System.out.println("Evaluating expression with p=FALSE, q=FALSE");
		context.assign(p, false);
		context.assign(q, false);
		System.out.println(expression.interpret(context));
	}

}
