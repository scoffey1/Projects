//Simple linked list with 5 nodes
//Nodes can be added if needed
public class LinkedList {

	 Node head; // head of list
	  
	    /* Linked list Node.  This inner class is made static so
	       that main() can access it */
	    static class Node {
	  //Change data type to any type you want the linked list to be
	  //String data;
	  //Node next;
	  //Node(String d)
	        int data;
	        Node next;
	        Node(int d)
	        {
	            this.data = d;
	            next = null;
	        } // Constructor
	    }
	  
	    /* This function prints contents of linked list starting
	     * from head */
	    public void printList()
	    {
	        Node n = head;
	        while (n != null) {
	            System.out.print(n.data + " ");
	            n = n.next;
	        }
	    }
	  
	    // 
	    public static void main(String[] args)
	    {
	        /* Start with the empty list. */
	        LinkedList llist = new LinkedList();
	        //Node list
	        llist.head = new Node(1);
	        Node second = new Node(2);
	        Node third = new Node(3);
	        Node fourth = new Node(4);
	        Node fifth = new Node(5);
	        Node sixth = new Node(6);
	  
	        llist.head.next = second; // Link first node with the second node
	                                  
	        second.next= third;// Linked second node with the third node
	            
	        third.next = fourth;// Linked third node with fourth node
	        
	        fourth.next = fifth;// Linked fourth node with fifth node
	        //Add node by simply repeating process above
	        //Add Node to Node List above and link it to previous node
	        fifth.next = sixth;
	        // Function call
	        llist.printList();
	    }
	}


/*
 * Time Complexity
 * Searching = O(n)
 * Insertion = O(1)
 * Deletion = O(1)
 * 
 * 
 * Simple class that would need a Node class to implement
 * 
class LinkedList {
    Node head; // head of the list
  
    //Linked list Node
    class Node {
        int data;
        Node next;
  
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
}
Applications of Linked List

● Linked Lists can be used to implement useful data structures like stacks and queues. 

● Linked Lists can be used to implement hash tables, each bucket of the hash table can be a linked list. 

● Linked Lists can be used to implement graphs (Adjacency List representation of graph). 

● Linked Lists can be used in a refined way in implementing different file systems in one form or another.


*/
