package tk.csparpa.gofdp.memento.variants;


/**
 * This is the class whose state is to be "snaphshot". Please notice that the
 * concrete implementation for the Memento abstract interface lies inside this
 * class as an inner class member. This is done in order to leverage the
 * visibility scope of inner classes with regards to the containing classes' 
 * instance fields.
 */
public class Originator {
	
	private String name;
	private int age;
	private String job;
	private double salary;
	
	public Originator(String name, int age, String job, double salary) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.salary = salary;
	}
	
	public Memento saveState(){
		return new ConcreteMemento();
	}
	
	/**
	 * Concrete implementation for the Memento interface
	 */
	class ConcreteMemento implements Memento {
		
		private String savedName;
		private int savedAge;
		private String savedJob;
		private double savedSalary;
		
		public ConcreteMemento() {
			savedName = name;
			savedAge = age;
			savedJob = job;
			savedSalary = salary;
		}

		@Override
		public void restoreState() {
			name = savedName;
			age = savedAge;
			job = savedJob;
			salary = savedSalary;
		}
	}
	
	public void setSalary(double newSalary){
		this.salary = newSalary;
	}
	
	public void setJob(String newJob){
		this.job = newJob;
	}
	
	public void greet(){
		System.out.println("Hello, I am " + name + ", I am " + Integer.toString(age) + 
				", I am a " + job + " and I earn " + Double.toString(salary));
	}
}