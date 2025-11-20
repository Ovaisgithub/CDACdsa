package assignmentads;
import java.util.Scanner;

public class Prob1 {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 int  i=0,temp=0;
		 
		 System.out.println("enter the size of array");
		 int n=sc.nextInt();
		 int []a=new int[n];
		 System.out.println("enter the array");
		 
		 for(i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 int max=a[0];
		 for(i=1;i<n;i++) {
			 if(max<=a[i]) {
				 temp=max;
				 max=a[i];
			 }
		 }
		 if(temp==max) {
		 System.out.println(-1);
		 }
		 else {
			 System.out.println("the 2nd largest element is:"+temp);
		 }
		 
		sc.close(); 
	 } 
}
