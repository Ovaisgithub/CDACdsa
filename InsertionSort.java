package ads;

import java.util.Scanner;


public class InsertionSort {
	
	
	static void sorting(int[] a,int n,int i) {
		int j=0;
		for(i=1;i<n;i++) {
			int key=a[i];
			j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			
		}
		
		System.out.println("sorted array is ");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		int n=0,i=0;
		System.out.println("enter the size of your array");
		n=sc.nextInt();
		System.out.println("enter elements of array");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		sorting(a,n,i);
		sc.close();
	  }

}
