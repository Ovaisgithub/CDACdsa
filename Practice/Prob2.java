package assignmentads;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,n=0;
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		int []a=new int[n];
	
		System.out.println("enter your array");
		 for(i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 for(i=n-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		 }
		 
		 sc.close();
	}
}
