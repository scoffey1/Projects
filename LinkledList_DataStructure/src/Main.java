import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		//*******************************************************
		// LinkedList = stores nodes in 2 parts (data + address)
		//              Nodes are in non-consecutive memory locations
		//              Elements are linked using pointers
		
		//                     Single-Linked List
		//           Node             Node              Node
		//      [data | address]->[data | address]->[data | address]
		
		//                     Doubly-Linked List
		//                 Node                           Node
		//      [address | data | address] <-> [address | data | address]
		
		//advantages
		//1. Dynamic data structure (allocates needed memory while running)
		//2. Insertion/deletion of Nodes is easy. O(1)
		//3. No/Low memory waste
		
		//disadvantages
		//1. Greater memory usage (additional pointer)
		//2. No random access of elements (no index [i])
		//3. Accessing/searching elements is more time consuming. O(N)
		
		//uses
		//1. implement stacks/queues
		//2. GPS navigation
		//3. music playlist
		//*******************************************************
		LinkedList<String> LinkedList = new LinkedList<String>();
		//LinkedList can be treated as a stack
		/*
		LinkedList.push("A");
		LinkedList.push("B");
		LinkedList.push("C");
		LinkedList.push("D");
		LinkedList.push("F");
		LinkedList.pop();
		*/
		//LinkedList treated as a Queue
		LinkedList.offer("A");
		LinkedList.offer("B");
		LinkedList.offer("C");
		LinkedList.offer("D");
		LinkedList.offer("F");
		//LinkedList.poll();
		
		LinkedList.add(4, "E");
		//LinkedList.remove("E");//Remove element E
		System.out.println(LinkedList.indexOf("F"));//Index = 5
		System.out.println(LinkedList.peekFirst());//First LinkedList
		System.out.println(LinkedList.peekLast());//Last LinkedList
		LinkedList.addFirst("0");//Adds Elements to front of list
		LinkedList.addLast("G");//Adds element to end of lists
		
		//String first = LinkedList.removeFirst();
		//String last = LinkedList.removeLast();
		
		System.out.println(LinkedList);
		
	}

}
