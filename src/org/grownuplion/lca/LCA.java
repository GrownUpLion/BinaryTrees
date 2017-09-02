package org.grownuplion.lca;
import java.util.ArrayList;
import java.util.List;
import org.grownuplion.nodes.Node;


public class LCA {

	
	
	public LCA() {
	}

	
	public static Node LowerComonAncestorNode(Node root,Object v1,Object v2){
		List<Node> ancestors1 = new ArrayList<Node>();
		List<Node> ancestors2 = new ArrayList<Node>();

		findPath(root.left,v1,ancestors1);
		findPath(root.right,v2,ancestors2);
		int i = 0 ;
		for (; i<ancestors1.size() && i<ancestors2.size();i++)
		{
			if(ancestors1.get(i)==ancestors2.get(i))break;
		}
		return ancestors1.get(i);
	}
	
	private static Boolean findPath(Node root,Object n,List<Node> ancestors){
		if(root == null)return false;
		
		ancestors.add(root);
		
		if ((root.compare(n))) return true;
		
		ancestors.remove(root.data);
		
		return findPath(root.left,n,ancestors) || findPath(root.right,n,ancestors);
	}
}
