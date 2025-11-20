package assignmentads;

import java.util.Scanner;

public class ListReverse {
	static Node2 head;
	
	void insert(int data) {
		Node2 node =new Node2(data);
		if(head==null) {
			head=node;
			return;
		}
		    node.next=head;
			head=node;
	}
	
	void print() {
		Node2 temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,n=0;
		ListReverse list=new ListReverse();
		
		System.out.println("enter the size of linked list");
		n=sc.nextInt();
		System.out.println("enter values");
		for(i=0;i<n;i++) {
			
			list.insert(sc.nextInt());
		}
		list.print();
		
		sc.close();
	}
}
class Node2{
	int data;
	Node2 next=null;
	Node2(int data){
		this.data=data;
		this.next=null;
	}
}