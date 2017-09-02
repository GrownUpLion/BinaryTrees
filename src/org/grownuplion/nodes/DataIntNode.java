package org.grownuplion.nodes;

public class DataIntNode extends Node {

	public DataIntNode(Node left, Node right, int data) {
		super(left, right);
		this.data = data;
	}

	public DataIntNode() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean compare(Object other) {
		if (other instanceof Integer) {
			return this.data == (Integer) other;
		}
		return false;
	}
}
