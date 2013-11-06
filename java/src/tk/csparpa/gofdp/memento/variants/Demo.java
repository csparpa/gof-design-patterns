package tk.csparpa.gofdp.memento.variants;


public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: Memento pattern  with inner class usage");
		System.out.println("Creating: new Originator with name=Joe, age=35,"
				+ " job=teacher, salary=1000.0");
		Originator originator = new Originator("Joe", 35, "teacher", 1000.0);
		originator.greet();
		System.out.println("Saving: originator's state");
		Memento memento = originator.saveState();
		System.out.println("Modifying: originator's job into programmer");
		originator.setJob("programmer");
		System.out.println("Modifying: originator's salary into 1100.0");
		originator.setSalary(1100.0);
		originator.greet();
		System.out.println("Restoring: former originator's state");
		memento.restoreState();
		originator.greet();
	}
}
