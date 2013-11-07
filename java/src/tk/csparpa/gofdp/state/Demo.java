package tk.csparpa.gofdp.state;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: State pattern");
		System.out.println("Creating: State factory");
		StateFactory factory = new StateFactory();
		System.out.println("Creating: Context instance with name=file.txt");		
		Context context = new Context("file.txt", factory);
		System.out.println("Adding: Context object to version control");
		context.add();
		System.out.println("Removing: Context object from version control");		
		context.revert();
	}
}
