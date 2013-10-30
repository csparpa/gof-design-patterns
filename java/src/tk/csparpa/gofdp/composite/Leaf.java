package tk.csparpa.gofdp.composite;

/**
 * This class represents the components having no children
 */
public class Leaf extends Component {
	
	public Leaf(int value, Component father){
		this.value = value;
		this.father = father;
	}

	@Override
	public int getSubtreeSum() {
		return value;
	}
}
