package assignmentads;

import java.util.Scanner;
import java.util.Stack;

public class Prob5 {
	
	
	public static boolean isBalanced(String s) {
		Stack<Character> st=new Stack<>();
		
		for(char ch: s.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}
			else if(ch==')' || ch=='}' || ch==']'){
				if(st.isEmpty())
					return false;
				char top=st.pop();
				if(ch==')' && top!='('|| 
				   ch=='}' && top!='{'||
				   ch==']' && top!='[') {
					return false;
				}
			}
		}
		return st.isEmpty();
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your expresion");
		String s=sc.nextLine();
		
		if(isBalanced(s)) {
			System.out.println("Balanced");
			}
		else {
			System.out.println("Not Balanced");
		}
		sc.close();
	}
}
