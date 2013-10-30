package tk.csparpa.gofdp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents components having children
 */
public class Composite extends Component {
	
	private List<Component> children;
	
	public Composite(int value, Component father){
		this.value = value;
		this.father = father;
		this.children = new ArrayList<Component>();
	}

	@Override
	public int getSubtreeSum() {
		int sum = value;
		for (Component child : children) {
			sum += child.getSubtreeSum();
		}
		return sum;
	}

	@Override
	public void addChild(Component child) throws UnsupportedOperationException {
		children.add(child);
	}

	@Override
	public void removeChild(Component child)
			throws UnsupportedOperationException {
		children.remove(child);
	}

	@Override
	public List<Component> getChildren() {
		return new ArrayList<Component>(children);
	}
}
