package tk.csparpa.gofdp.visitor;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: Visitor pattern");
		System.out.println("Creating: composite object structure");
		Element a = new ConcreteElementA("hello");
		Element b = new ConcreteElementB(91.567);
		Element c = new ConcreteElementC(new Box("mailbox", 7));
		Element d = new ConcreteElementA("tom");
		Element e = new ConcreteElementA("jerry");
		List<Element> inner = Arrays.asList(d,e);
		List<Object> structure = Arrays.asList(a,b,c,inner);
		System.out.println("Creating: ConcreteVisitor");
		Visitor visitor = new ConcreteVisitor();
		System.out.println("Visiting: object structure");
		visitor.visit(structure);
	}

}
