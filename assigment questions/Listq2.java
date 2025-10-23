package assignmentads;

import java.util.Scanner;

public class Listq2 {
	Listq2Node head;
	void insert(int data) {
		Listq2Node node=new Listq2Node(data);
		if(head==null) {
			head=node;
			node.next=head;
			return;
		}
		Listq2Node temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp.next=node;
		node.next=head;
		
	}
	void befDel(int pos) {
		int i=0;
		Listq2Node prev=head;
		Listq2Node curr=head.next;
		if(pos==1) {
			while(curr.next!=head) {
				prev=curr;
				curr=curr.next;
			}
			prev.next=curr.next;
			curr.next=null;
		}
		else if(pos==2) {
			head=head.next;
			prev.next=null;
			Listq2Node temp=head;
			while(temp.next!=prev) {
				temp=temp.next;
			}
			temp.next=head;
			
			
		}
		else {
		for(i=1;i<pos;i++) {
			if(i==pos-2) {
			prev.next=curr.next;
			curr.next=null;
			break;
			}
			prev=curr;
			curr=curr.next;
		}
	  }
		
		print();
	}
	void aftDel(int pos) {
		int i=0;
		Listq2Node prev=head;
		Listq2Node curr=head.next;
		for(i=1;i<=pos;i++) {
			if(i==pos && curr==head) {
				head=head.next;
				prev.next=head;
				curr.next=null;
			
			}
			else if(i==pos){
			prev.next=curr.next;
			curr.next=null;
			
			}
			prev=curr;
			curr=curr.next;
		}
		
		
		print();
		
	}
	void print() {
		Listq2Node temp = head;
		do {System.out.print(temp.data+" ");
		temp = temp.next;}
		while(temp!=head);
		System.out.println();
			
			
	}

	public static void main(String[] args) {
		int i=0,n=0,m=0;
		Scanner sc=new Scanner(System.in);
		Listq2 L=new Listq2();
		Listq2 L2=new Listq2();
		
		System.out.println("enter the no. of nodes");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
		System.out.println("enter the value");
		m=sc.nextInt();		
		L.insert(m);
		L2.insert(m);
		}
		System.out.println("enter position:");
		int pos=sc.nextInt();
		
         L.befDel(pos);
         L2.aftDel(pos);
         
		 sc.close();

	}
}
class Listq2Node{
	int data;
	Listq2Node next;
	Listq2Node(int data){
		this.data=data;
		this.next=null;
	}
	
	
}