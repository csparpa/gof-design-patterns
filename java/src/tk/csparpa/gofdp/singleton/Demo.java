package tk.csparpa.gofdp.singleton;

import tk.csparpa.gofdp.singleton.Singleton;;

public class Demo {
	
	public static void main(String[] args){
		System.out.println("***Demo: singleton pattern");
		System.out.println("Getting: reference to Singleton instance");
		Singleton singleton = Singleton.getInstance();
		singleton.greet();
		System.out.println("Getting: another reference to Singleton instance");
		Singleton anotherSingleton = Singleton.getInstance();
		anotherSingleton.greet();
		System.out.println("Checking: the two references point to the same object");
		if(singleton == anotherSingleton){
			System.out.println("True");
		}
		else{
			System.out.println("False");			
		}
		
		System.out.println("");
		System.out.println("***Demo: monostate pattern");
		System.out.println("Creating: first monostate");
		Monostate monostate1 = new Monostate();
		System.out.println("Creating: second monostate");
		Monostate monostate2 = new Monostate();
		System.out.println("Checking: state of first monostate");
		monostate1.greet();
		System.out.println("Checking: state of second monostate");
		monostate2.greet();
		System.out.println("Checking: the two references point to the same object");
		if(monostate1 == monostate2){
			System.out.println("True");
		}
		else{
			System.out.println("False");			
		}
		System.out.println("Changing: state of monostate to stateABC");
		monostate1.setState("ABC");	
		System.out.println("Checking: state of first monostate");
		monostate1.greet();
		System.out.println("Checking: state of second monostate");
		monostate2.greet();		
	}
}
