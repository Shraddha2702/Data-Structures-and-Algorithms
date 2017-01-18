//DFS and BFS
//Tree Transversal
//Java Program

import java.util.Stack;
import java.util.*;

class treetrans
{
	void dfs(Node root)
	{
		Stack<Node> s = new Stack<Node>();
		
		s.push(root);
		
		while(!s.isEmpty())
		{
			Node x = s.pop();
			
			System.out.print("\t"+x.data);
			if(x.right != null) s.push(x.right);
			if(x.left != null) s.push(x.left);
			
		}
	}
	
	void bfs(Node root)
	{
		Queue s = new LinkedList();
		
		s.add(root);
		
		while(!s.isEmpty())
		{
			Node x = s.remove();
			
			System.out.print("\t"+x.data);
			
			if(x.left != null) s.add(x.left);
			if(x.right != null) s.add(x.right);
			
		}
	}
	
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		treetrans tb = new treetrans();
		
		tb.dfs(root);
		tb.bfs(root);
	}
}

class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
}