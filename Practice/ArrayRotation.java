package assignmentads;

import java.util.Scanner;

public class ArrayRotation {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=0,j=0,n=0,k=0;
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		System.out.println("enter your array");
		 for(i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 
		System.out.println("enter the number of steps");
		k=sc.nextInt();
		k=k%n;
		for(i=0;i<k;i++) {
			b[i]=a[n-k+i];
		}
		
		for(i=k;i<n;i++) {
			b[i]=a[i-k];
		}
		for(i=0;i<n;i++) {
			System.out.println(b[i]);
		}
		sc.close();
	}
}
