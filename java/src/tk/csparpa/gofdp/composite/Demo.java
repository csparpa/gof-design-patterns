package tk.csparpa.gofdp.composite;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: composite pattern");
		System.out.println("Example: binary tree");
		System.out.println("Creating: root node, N01");
		Component n01 = new Composite(4, null);
		System.out.println("Creating: level 1 node, N11 - son of N01");
		Component n11 = new Composite(10, n01);
		System.out.println("Creating: level 1 node, N12 - son of N01");
		Component n12 = new Composite(2, n01);
		n01.addChild(n11);
		n01.addChild(n12);
		System.out.println("Creating: level 2 node, N21 - son of N11");
		Component n21 = new Leaf(7, n11);
		System.out.println("Creating: level 2 node, N22 - son of N11");
		Component n22 = new Leaf(5, n11);
		n11.addChild(n21);
		n11.addChild(n22);
		System.out.println("Creating: level 2 node, N23 - son of N12");
		Component n23 = new Leaf(1, n12);
		n12.addChild(n23);
		System.out.println("Calling: subtree sum for node n01");
		System.out.println(Integer.toString(n01.getSubtreeSum()));
		System.out.println("Trying: to add child to node n23");
		try{
			n23.addChild(null);
		}
		catch(UnsupportedOperationException e){
			e.printStackTrace();
		}
		System.out.println("Creating: new level 2 node, N24 - son of N12");
		Component n24 = new Leaf(9, n12);
		n12.addChild(n24);
		System.out.println("Calling: subtree sum for node n01");
		System.out.println(Integer.toString(n01.getSubtreeSum()));
		System.out.println("Removing: level 2 node N22 as son of N11");
		n11.removeChild(n22);
		System.out.println("Listing: children of level 1 node N11");
		for(Component c: n11.getChildren()){
			System.out.println("  >>> "+c);
		}
		System.out.println("Calling: subtree sum for node n01");
		System.out.println(Integer.toString(n01.getSubtreeSum()));
	}

}
