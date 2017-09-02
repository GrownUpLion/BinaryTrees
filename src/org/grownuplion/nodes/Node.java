package org.grownuplion.nodes;

import org.grownuplion.interfaces.NodeDataComparer;

public class Node implements NodeDataComparer {
	
	public Node left, right;
	public Object data;

	public Node(Node left, Node right) {
		this.left = left;
		this.right = right;
	}

	public Node() {
	}

	public boolean compare(Object other) {
		if (other != null) return other.equals(this);
		return false; 
	}

}
