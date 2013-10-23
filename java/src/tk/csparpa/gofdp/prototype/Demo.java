package tk.csparpa.gofdp.prototype;

import java.util.Date;

public class Demo {

	public static void main(String[] args) throws Exception {
		System.out.println("***Demo: prototype pattern");
		AbstractPrototype instance1 = 
				new ConcretePrototype("Frank", 31, new Date(468982567890L));
		instance1.greet();
		AbstractPrototype instance2 = instance1.clone();
		instance2.greet();
		System.out.println("Checking: if prototypes are equal");
		if(instance1.equals(instance2)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}