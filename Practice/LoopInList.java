package assignmentads;

import java.util.Scanner;

public class LoopInList {
	static Node3 head; 
	void insert(int data) {
		Node3 node =new Node3(data);
		Node3 temp=head;
		if(head==null) {
			head=node;
			return;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		 temp.next=node;
	}
	boolean loop(int pos) {
		Node3 temp=head;
		
		int i=1;
		while(i<pos) {
			temp=temp.next;
			i++;
		}
		Node3 loop=temp;
		while(loop.next!=null) {
			loop=loop.next;
		}
		loop.next=temp;
		
		if(loop.next==temp) {
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LoopInList l=new LoopInList();
		int i,n,pos=0;
		System.out.println("enter the number of nodes");
		n=sc.nextInt();
		System.out.println("enter the values");
		for(i=0;i<n;i++) {
			l.insert(sc.nextInt());
		}
		System.out.println("enter the positoin where tail connects or -1 for no loop");
		pos=sc.nextInt();
		
		if(l.loop(pos)) {
			System.out.println("loop found");
		}
		else {
			System.out.println("no loop");
		}
		sc.close();
	}
	
}
class Node3{
	int data;
	Node3 next=null;
	Node3(int data){
		this.data=data;
		this.next=null;
	}
}
