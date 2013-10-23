package tk.csparpa.gofdp.adapter;

/**
 * This is the "legacy" class that must be adapted to the target interface.
 */
public class Adaptee {
	
	private double operand1;
	private double operand2;
	
	public Adaptee(double operand1, double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	public double getFirstOperand(){
		return this.operand1;
	}
	
	public double getSecondOperand(){
		return this.operand2;
	}
	
	public double computeSum(){
		return this.operand1 + this.operand2;
	}
	
	public double max(){
		return Math.max(this.operand1, this.operand2);
	}
}
