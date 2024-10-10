/*
Problem - Convert an Array to a Doubly LinkedList
Approach - 1. create an array
		   2. create a Node class
		   3. create a function to conversion - a. variables - root node, end node and currentNode
		   										b. loop through array and add it ot linkedlist
		   										c. print the linkedlist
Time Complexity - O(n)
Space Complexity - Array Storage - O(n)
				   Doubly LinkedList - O(n)
				   Variable - O(1)
				   Overall - O(n)		   										

*/

public class ConvertToDoublyLinkedList{
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	public void convertToDoublyLinkedList(int[] array){
		Node root = new Node(array[0]);
		Node end = root;
		int tracker = 1;
		while(tracker<array.length){
			Node currentNode = new Node(array[tracker]);
			currentNode.prev = end;
			end.next = currentNode;
			end = currentNode;
			tracker++;
		}
		printLinkedList(root);
	}
	public void printLinkedList(Node root){
		Node currentNode = root;
		while(currentNode!=null){
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
	public static void main(String[] args){
		int[] array = {3,6,5,1,2,9,6,0,3};
		ConvertToDoublyLinkedList ctdll = new ConvertToDoublyLinkedList();
		ctdll.convertToDoublyLinkedList(array);
	}
}
