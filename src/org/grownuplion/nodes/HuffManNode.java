package org.grownuplion.nodes;

public class HuffManNode extends DataCharNode {

	@SuppressWarnings("unused")
	private int frequency;
	
	
	public HuffManNode(char data,int frequency,Node left,Node right) {
		super(left,right,data);
		this.frequency = frequency;
	}

	
	public HuffManNode() {
		// TODO Auto-generated constructor stub
	}

}
