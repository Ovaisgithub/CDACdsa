package ads;


import java.util.Scanner;


public class Padosan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0,i=0,j=0,k=0,count=0;
		
		System.out.println("enter the num of squares");
		n=sc.nextInt();
		
		int[][] a=new int[n][8];
		
		System.out.println("enter the coordinates in x and y pairs");

		for(i=0;i<n;i++) {
			for(j=0;j<8;j++) {
				a[i][j]=sc.nextInt();			
				}
		  }
		
		
		
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<8;j++) {
				System.out.println(a[i][j]);			
				}
		}
		 
		for(i=0;i<=a.length+1;i++) {
			for(j=0;j<8;j+=2) {
				for(k=0;k<8;k+=2) {
				if(a[i][j]==a[i+1][k] && a[i][j+1]==a[i+1][k+1]) {
					count++;
				}			
			}
		}
	  }
		System.out.println("num of matching vertices "+count);
		sc.close();
	}

}
