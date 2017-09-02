package org.grownuplion.huffman;

import org.grownuplion.nodes.Node;


public class HuffManDecoder {

	public HuffManDecoder() {
		
	}

	public static void decode(String S, Node root) {
		int index = 0;
		while (index < S.length()) index = decode(S, root, index);

	}

	public static int decode(String S, Node root, int index) {
		if (root.left != null) {
			int numberValue = Character.getNumericValue(S.charAt(index));
			if (numberValue == 1) return decode(S, root.right, index + 1);
			else return decode(S, root.left, index + 1);
		}
		System.out.print(root.data);
		return index;
	}

}
