package tk.csparpa.gofdp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract interface for components, providing stub failing implementations for
 * children handling (add/remove) and for setting/getting references to the
 * father component
 */
public abstract class Component {
	
	protected int value;
	protected Component father = null;
	
	//Tells the numerical value bound to this Component
	public int getValue(){
		return this.value;
	}
	
	//Tells the recursive sum of the numerical values of the Components that
	//have this Component as ancestor
	public abstract int getSubtreeSum();
	
	//Adds a new child to this Component
	public void addChild(Component child) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	//Remove the specified child from the Component
	public void removeChild(Component child) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	//Accessor to the children of this Component
	public List<Component> getChildren(){
		return new ArrayList<Component>();
	}
}
