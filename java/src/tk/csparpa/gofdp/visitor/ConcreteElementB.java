package tk.csparpa.gofdp.visitor;

public class ConcreteElementB implements Element {
	
	private double aDouble;
	
	public ConcreteElementB(double aDouble) {
		this.aDouble = aDouble;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public double getDouble(){
		return aDouble;
	}
}
