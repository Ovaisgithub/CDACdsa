package assignmentads;

import java.util.Scanner;

public class MissingNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=0,n=0;
		
		System.out.println("enter the range of numbers");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter your numbers");
		for(i=0;i<n-1;i++) {
			a[i]=sc.nextInt();
		}
		int j=1;
		for(i=0;i<n;i++) {
			if(a[i]!=j) {
				System.out.println(j);
				break;
			}
			j++;
		}
	}
}
