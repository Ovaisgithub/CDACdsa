package assignmentads;

import java.util.Scanner;

public class Prob3 {
	static Nodeprob3 head;
	void insert(int data) {
		Nodeprob3 node = new Nodeprob3(data);
		if(head==null) {
			head=node;
			return;
			
		}
		Nodeprob3 temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
		
	}
	void insertatpos(int pos,int val) {
		Nodeprob3 temp=head;
		Nodeprob3 node=new Nodeprob3(val);
		int i=1;
		if(pos==1) {
			node.next=head;
			head=node;
		}
		else {
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		node.next=temp.next;
		temp.next=node;
		return;
		}
	}
	void print() {
		Nodeprob3 temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Prob3 list=new Prob3();
		int i=0,n=0,pos=0,val=0;
		System.out.println("enter number of nodes:");
		n=sc.nextInt();
		System.out.println("enter values");
		for(i=0;i<n;i++) {
			list.insert(sc.nextInt());
		}
		System.out.println("enter the positon");
		pos=sc.nextInt();
		System.out.println("enter the value");
		val=sc.nextInt();
		
		list.insertatpos(pos,val);
		list.print();
		
		sc.close(); 
	}
}
class Nodeprob3{
	int data;
	Nodeprob3 next=null;
	Nodeprob3(int data){
		this.data=data;
		this.next=null;
	}
}
