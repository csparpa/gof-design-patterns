package tk.csparpa.gofdp.visitor;

public class ConcreteElementC implements Element {
	
	private Box box;
	
	public ConcreteElementC(Box box) {
		this.box = box;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String getBoxLabel(){
		return box.getLabel();
	}
	
	public int getBoxNumber(){
		return box.getNumber();
	}
}
