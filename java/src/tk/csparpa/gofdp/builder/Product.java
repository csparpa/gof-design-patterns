package tk.csparpa.gofdp.builder;

/**
 * 
 * This class represents the complex object to be built
 *
 */
public class Product {
	
	private String partA;
	private int partB;
	
	public void addPartA(String part){
		System.out.println("Adding: partA to Product instance");
		this.partA = part;
	}
	
	public void addPartB(int part){
		System.out.println("Adding: partB to Product instance");
		this.partB = part;
	}
}
