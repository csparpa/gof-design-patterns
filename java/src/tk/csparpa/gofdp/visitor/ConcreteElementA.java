package tk.csparpa.gofdp.visitor;

public class ConcreteElementA implements Element {
	
	private String string;

	public ConcreteElementA(String string) {
		this.string = string;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String getString(){
		return string;
	}
}
