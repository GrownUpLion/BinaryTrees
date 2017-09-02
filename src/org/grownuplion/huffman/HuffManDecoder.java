package org.grownuplion.huffman;

import org.grownuplion.nodes.Node;


public class HuffManDecoder {

	public HuffManDecoder() {
		//Node d = new Node(1,'B',null,null);
		//Node e = new Node(1,'C',null,null);
		//Node c = new Node(2,'$',d,e);	
		//Node b = new Node(3,'A',null,null);
		//Node a = new Node(5,'$',c,b);
		//decode("1001011", a);
	}

	static void decode(String S, Node root) {
		int index = 0;
		while (index < S.length()) index = decode(S, root, index);

	}

	static int decode(String S, Node root, int index) {
		if (root.left != null) {
			int numberValue = Character.getNumericValue(S.charAt(index));
			if (numberValue == 1) return decode(S, root.right, index + 1);
			else return decode(S, root.left, index + 1);
		}
		System.out.print(root.data);
		return index;
	}

}
