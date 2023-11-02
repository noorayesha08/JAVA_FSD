package Phase1Module3;

public class DeleteSinglyLinkedList {
	Node head;

	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	void deleteNode(int key)
	{
		// Store head node
		Node temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {

			// Changed head
			head = temp.next;
			return;
		}

		// Search for the key to be deleted, keep track of
		// the previous node as we need to change temp.next
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;
	}

	// Inserts a new Node at front of the list.
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	// This function prints contents of linked list
	// starting from the given node
	public void printList()
	{
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}


	public static void main(String[] args)
	{
		DeleteSinglyLinkedList dllist = new DeleteSinglyLinkedList();

		dllist.push(7);
		dllist.push(1);
		dllist.push(3);
		dllist.push(2);

		System.out.println("Created Linked List:");
		dllist.printList();

		dllist.deleteNode(1);

		System.out.println(
				"\nLinked List after Deletion of 1:");
		dllist.printList();
	}

}
