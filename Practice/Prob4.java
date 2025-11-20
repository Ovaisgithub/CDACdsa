package assignmentads;

import java.util.Scanner;

public class Prob4 {
	static Nodeprob4 head;
	void insert(int data) {
		Nodeprob4 node=new Nodeprob4(data);
		if(head==null) {
			head=node;
			return;
		}
		Nodeprob4 temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
		
	}
	void del(int val) {
		Nodeprob4 temp=head.next;
		Nodeprob4 prev=head;
		
		while(temp.next!=null) {
			if(prev.data==val) {
				head=temp;
				prev.next=null;
				return;
			}
			else if(temp.data==val && temp.next==null) {
				
			}
			else if(temp.data==val) {
				prev.next=temp.next;
				temp.next=null;
				return;
			}
			else {
				prev=temp;
				temp=temp.next;
				
			}
		}
		prev.next=null;
	}
	void print() {
		Nodeprob4 temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Prob4 list=new Prob4();
		int i=0,n=0,val=0;
		System.out.println("enter the number nodes");
		n=sc.nextInt();
		System.out.println("enter the values");
		for(i=0;i<n;i++) {
			list.insert(sc.nextInt());
		}
		System.out.println("enter the value to be deleted");
		val=sc.nextInt();
		
		list.del(val);
		list.print();
	}
	
	
	
}
class Nodeprob4{
	int data;
	Nodeprob4 next=null;
	Nodeprob4(int data){
		this.data=data;
		this.next=null;
	}
}