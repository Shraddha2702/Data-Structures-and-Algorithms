//Breadth First Search and Depth First Search in Bt

//Just create a Class Node
//In BFS use Queue Implementation : Methods -- offer(Node) and poll()
//In DFS use Stack Implementation : Methods -- push(Node) and pop()

import java.util.*;

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


class BinaryTree1
{

	void bfs(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		
		q.offer(root);
		
		while(!q.isEmpty())
		{
			Node x = q.poll();
			
			if(x.left != null) q.offer(x.left);
			if(x.right != null) q.offer(x.right);
			
			System.out.print("\t"+x.data);
		}
	}
	
	void dfs(Node root)
	{
		Stack<Node> s = new Stack<Node>();
		
		s.push(root);
		
		while(!s.isEmpty())
		{
			Node x = s.pop();
			
			if(x.right != null) s.push(x.right);
			if(x.left != null) s.push(x.left);
			
			System.out.print("\t"+x.data);
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
		
		BinaryTree1 bt = new BinaryTree1();
		
		System.out.print("BFS :");
		bt.bfs(root);
		
		System.out.print("\nDFS :");
		bt.dfs(root);
	}
}