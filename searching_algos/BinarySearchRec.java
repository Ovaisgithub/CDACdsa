package ads;

import java.util.Scanner;

public class BinarySearchRec {
	
		static int findElement(int a[],int low,int high,int search) {
		
		if(low>high) {
			System.out.println("value not in the array");
			return 0;
		}
		int mid=(low+high)/2;
		if(search==a[mid]) {
			return mid;
		}
		if(search<a[mid]) {
			return findElement(a,low,mid-1,search);
		}
		else {
			return findElement(a,mid+1,high,search);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,j=1,n=0;
		int search=0,loc=0,low=0;
		int [] a=new int[10];
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the elements to be sorted");
		
		for(i=0;i<n;i++) {
		a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			
			for(j=1;j<n-i;j++) {
				
				if(a[j-1]>a[j]) {
					
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;	
				}
			}
			
		}
		
		System.out.println("enter the element to be searched");
		search=sc.nextInt();
		
		loc=findElement(a,low,n-1,search);
		System.out.println("element found at index: "+loc);
		
		sc.close();
	}
	
	
}

