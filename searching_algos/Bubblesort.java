package ads;

import java.util.Scanner;

public class Bubblesort {
	
	static void sorting(int[] a,int n,int i) {
		int counter=0,swapc=0,swapt=0,j=0;
		boolean swap = false;
		
		for(i=0;i<n;i++) {
			counter++;
			swap=false;
			for(j=1;j<n-i;j++) {
				
				if(a[j-1]>a[j]) {
					swap=true;
					swapc++;
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;	
				}
			}
		
		if(swap) {
			System.out.println("swap happened. "+swapc);
			swapt+=swapc;
			swapc=0;
		} else {
			System.out.println("array is sorted after " +--counter+ " passes and "+swapt+ " swaps" );
			break;
		}
	}	
		
		System.out.println("sorted array is");
		
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
			}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int [] a=new int[10];
		
		
		
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		System.out.println("enter the elements to be sorted");
		
		for(i=0;i<n;i++) {
		a[i]=sc.nextInt();
		}
		
		sorting(a,n,i);
		
		sc.close();
	}
}
