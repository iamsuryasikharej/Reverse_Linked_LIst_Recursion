
public class Runner {

	public static void main(String [] args)
	{
		LinkedList l=new LinkedList();
		l.insert(11);
		l.insert(13);
		l.insert(22);
		l.insert(2222);
		l.insert(223);
		l.insert(222);

//		l.dispRecursive(l.rootNode);
//		System.out.println(l.rootNode.next.next.data);
		Node node=l.reverseLinkedList(l.rootNode);
		l.dispRecursive(node);
	}
}
