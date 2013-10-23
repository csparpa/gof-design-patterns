package tk.csparpa.gofdp.adapter;

import tk.csparpa.gofdp.adapter.Adaptee;
import tk.csparpa.gofdp.adapter.ClassAdapter;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: pattern Adapter with class adaptation");
		System.out.println("Creating: Adaptee");
		Adaptee adaptee = new Adaptee(3.2, 6.7);
		System.out.println("");
		System.out.println("Creating: class adapter");
		TargetInterface classAdapter = new ClassAdapter(3.2, 6.7);
		System.out.println("Getting: operands through the Adaptee interface");
		System.out.println(Double.toString(adaptee.getFirstOperand()));
		System.out.println(Double.toString(adaptee.getSecondOperand()));
		System.out.println("Getting: operands through the TargetInterface interface");
		System.out.println(classAdapter.getOperands().toString());
		System.out.println("Getting: operands sum through the Adaptee interface");
		System.out.println(Double.toString(adaptee.computeSum()));
		System.out.println("Getting: operands sum through the TargetInterface");
		System.out.println(Double.toString(classAdapter.sum()));
		
		System.out.println("");
		System.out.println("***Demo: pattern Adapter with object adaptation");
		System.out.println("Creating: object adapter");
		TargetInterface objectAdapter = new ObjectAdapter(adaptee);
		System.out.println("Getting: operands through the Adaptee interface");
		System.out.println(Double.toString(adaptee.getFirstOperand()));
		System.out.println(Double.toString(adaptee.getSecondOperand()));
		System.out.println("Getting: operands through the TargetInterface interface");
		System.out.println(objectAdapter.getOperands().toString());
		System.out.println("Getting: operands sum through the Adaptee interface");
		System.out.println(Double.toString(adaptee.computeSum()));
		System.out.println("Getting: operands sum through the TargetInterface");
		System.out.println(Double.toString(objectAdapter.sum()));
	}
}
