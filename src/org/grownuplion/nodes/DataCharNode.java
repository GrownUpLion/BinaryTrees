package org.grownuplion.nodes;

public class DataCharNode extends Node{

	public DataCharNode() {
		// TODO Auto-generated constructor stub
	}

	public DataCharNode(Node left, Node right, char data) {
		super(left, right);
		this.data = data;
	}

	@Override
	public boolean compare(Object other) {
		if (other instanceof Character) {
			return this.data == (Character) other;
		}
		return false;
	}

}
