package tk.csparpa.gofdp.prototype;

import java.util.Date;

/**
 * Concrete implementation of the abstract interface for object cloning.
 */
public class ConcretePrototype extends AbstractPrototype {
	
	private String name;
	private int age;
	private Date birth;
	
	public ConcretePrototype(String name, int age, Date birth){
		this.name = name;
		this.age = age;
		this.birth = birth;
	}

	/**
	 * Implementation of the cloning interface. Notice that we are relying on the
	 * clone operations implemented by the sub-objects of this class 
	 */
	@Override
	public AbstractPrototype clone() throws CloneNotSupportedException {
		System.out.println("Cloning this object");
		AbstractPrototype theClone = 
				new ConcretePrototype(new String(this.name),
									this.age,
									(Date) this.birth.clone());
		return theClone;
	}
	
	@Override
	public void greet(){
		System.out.println("Hi I am a concrete protoype, name="+
				this.name+" age="+Integer.toString(this.age)+
				" born on="+this.birth.toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConcretePrototype other = (ConcretePrototype) obj;
		if (age != other.age)
			return false;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
