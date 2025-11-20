package ads;

import java.util.Scanner;

public class SelectionSort {
	
		
		static void sorting(int[] a,int n,int i) {
			 	int j=1;
				for(i=0;i<n;i++) {
				    int min=i;
				for(j=i+1;j<n;j++) {
					
					if(a[j]<a[min]) {
						
						min=j;		
					}
					int temp=a[min];
					a[min]=a[i];
					a[i]=temp;
				}
				
			}
			System.out.println("sorted array is:");
			for(i=0;i<n;i++) {
				System.out.println(a[i]);
				}
		}
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int i=0;
			int [] a=new int[100];
		
					
			
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
