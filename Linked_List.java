			//			Abhishek Sunil Uphade

/*	
	Linked List Code in Core Java
	Single Linked List 
	head = First Element
	next = next pointer 
	NewNode = new Node of Linked List
	CuurentNode = Current Node for Linked List
	prev = Previous Node of Linked List
*/

// Linked List Operation
// Insertion node 1,2,3,4,5,6,7,8,9,10
// Deletion node 1 & 7 
		
import java.io.*;
class Linked_List{

	// Creating node
	Node head;			//head for linked list
	static class Node{
		int data;
		Node next;
		
		//constructor of node
		Node (int d){
			data=d;
			next=null;
		}
	}

	//Insertion in Linked List
	public static Linked_List insertion(Linked_List list , int data){
		Node NewNode = new Node(data);
		NewNode.next = null;
		if(list.head == null){
			list.head = NewNode;
		}
		else{
			Node last = list.head;
			while(last.next!=null){
				last=last.next;
			}
			last.next = NewNode;
		}
		return list;
	}

	//Printing of Linked List
	public static void Printing(Linked_List list){
		Node CurrentNode = list.head;
		System.out.println("Linked List : ");
		while(CurrentNode!=null){
			System.out.print(CurrentNode.data + " -> ");
			CurrentNode=CurrentNode.next;
			
		}
		System.out.print("NULL");
		System.out.println();
	}

	//Deleting of Linked List
	public static Linked_List Deletion(Linked_List list , int index){
		Node CurrentNode = list.head , prev =null;

		//Deleting the head node
		if(index==0 && CurrentNode!=null){
			list.head = CurrentNode.next;
			System.out.println(index+" Deleted Node");
			return list;
		}
		//Deleting the node with random position;
		int counter =0;
		while(CurrentNode!=null){
			if(counter==index){
				prev.next=CurrentNode.next;
				System.out.println(index+" Deleted Node");
				break;
			}		
			else{
				prev = CurrentNode;
				CurrentNode=CurrentNode.next;
				counter++;
			}
		}

		//Deleting the number that is not present
		if(CurrentNode==null){
			System.out.println("Deleting Node is absent");
		}
		return list;
		}
	
	//main Class
	public static void main (String ar[]){
		Linked_List list = new Linked_List();

		//inserting the given value 
		list = insertion(list,1);
		list = insertion(list,2);
		list = insertion(list,3);
		list = insertion(list,4);
		list = insertion(list,5);
		list = insertion(list,6);
		list = insertion(list,7);
		list = insertion(list,8);
		list = insertion(list,9);
		list = insertion(list,10);

		Printing(list);
		
		//Deletion of first index node
		Deletion(list,0);

		Printing(list); 

		//Deletion of 5 index node
		Deletion(list,5);

		Printing(list);
		
		//Deletion of abesnt index node
		Deletion(list,11);

		Printing(list); 
	}
}