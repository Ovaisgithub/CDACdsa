package ads;

import java.util.Scanner;

public class BinarySearchIteration {

	static void bSearch(int[] a,int n,int i, int j,Scanner sc) {
		int search=0,loc=0,low=0,mid=0;
		System.out.println("enter the value to be searched");
		search=sc.nextInt();
		
		int high=n-1;
		while(low<=high) {
			mid=(low+high)/2;
			if(search==a[mid]) {
				loc=mid;
				System.out.println("element found at index "+loc);
				break;
			}
			else if(search<a[mid]){
				high=mid;
			}
			else if(search>a[mid]) {
				low=mid;
			}
			else {
				System.out.println("binary search completed and value is not in the array");
				
			}
					
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,j=1,n=0;
		int [] a=new int[10];
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the elements of array");
		
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
		
		bSearch(a,n,i,j,sc);
		
		
	sc.close();	
	}	
}
