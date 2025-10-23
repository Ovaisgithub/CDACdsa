package assignmentads;

import java.util.Scanner;

public class Listq1 {
	static Listq1Node head;
	void insert(int data) {
		Listq1Node node=new Listq1Node(data);
		if(head==null) {
			head=node;
			return;
		}
		Listq1Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}
	
	void check() {
		Listq1Node prev=head;
		Listq1Node temp=head.next;
		Listq1Node loc=head;
		
		while(temp!=null) {
			boolean del=false;
			if(prev==head && temp.data>prev.data) {
				head=temp;
				prev.next=null;
			}
			else if(temp.data>prev.data) {
				loc.next=prev.next;
				prev.next=null;
				del=true;
			}
			if(del) {
			prev=temp;
			temp=temp.next;
			}
			else{
			loc=prev;
			prev=temp;
			temp=temp.next;
			}
		}
			
		
		print();
	}
	void print(){	
		Listq1Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		int i=0,n=0;
		Scanner sc=new Scanner(System.in);
		Listq1 L=new Listq1();
		
		System.out.println("enter the no. of nodes");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
		System.out.println("enter the value");
		
		L.insert(sc.nextInt());
		}
		
         L.check();
		
		 sc.close();
	}
	
}
class Listq1Node{
	int data;
	Listq1Node next;
	Listq1Node(int data){
		this.data=data;
		this.next=null;
	}
	
	
}
