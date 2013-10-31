package tk.csparpa.gofdp.templatemethod;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println("***Demo: pattern Template Method");
		System.out.println("Integrating: parabila from 0 to 5.3, 10 steps using "
				+ "trapezoidal rule");
		AbstractClass trapezoidalIntegrator = new ConcreteClassA(10);
		System.out.println(Double.toString(trapezoidalIntegrator.doIntegrateParabola(0, 5.3)));
		System.out.println("Integrating: parabila from 0 to 5.3, 10 steps using "
				+ "mid-point rule");
		AbstractClass midpointIntegrator = new ConcreteClassB(10);
		System.out.println(Double.toString(midpointIntegrator.doIntegrateParabola(0, 5.3)));
	}
}
