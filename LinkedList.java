
public class LinkedList {

	Node rootNode;
	
	//Method 1
	public void insert(int data)
	{
		rootNode=insert(rootNode,data);
		
		
	}
	
	//Method 2
	private Node insert(Node node,int data)// private insert method can be accessed from inside this class only
	{
		if(node==null)
		{
			Node nnode=createNewNode(data);
			
			return nnode;
		}
		
		
		else {
		Node temp=node;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=createNewNode(data);
	
		}
	
		return node;
	}
	
	//Method 3
	private Node createNewNode(int data) // private createNode method can be accessed from inside this class only// This method creates a new node and returns that
	
	{
	
		Node n=new Node();
		n.data=data;
		return n;
	}
	
	//Method 4
	public void disp()
	{
//		disp(rootNode);
		dispRecursive(rootNode);
	}
	
	//Method 5
	private void disp(Node node) //private disp method cann be accessed from inside thsi class only
	{
		Node temp=node;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
		
	}
	
	//Method disp recursive
	public void dispRecursive(Node node)
	{
		if(node==null)
		{
			return ;
			
		}
		System.out.println(node.data);
		dispRecursive(node.next);
	}
	
	//
	
	public Node reverseLinkedList(Node node)
	{
		if(node == null)
		{
			return null;
		}
		else if(node.next==null)
		{
			return node;
		}
		else
		{
			Node nnode=node.next;
			node.next=null;
			Node rest=reverseLinkedList(nnode);
			nnode.next=node;
			return rest;
		}
		
		
	}

	
}
