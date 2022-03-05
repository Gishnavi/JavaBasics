package test;

import java.util.Scanner;

public class Test2 {
int a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test2 result = new Test2();
		result.a = sc.nextInt();
		if(result.a==18) {
			System.out.println("Come next year");
		}
		else if (result.a<18) {
			System.out.println("not eligible to vote");
		} 
		else {
System.out.println("Eligible to vote");
		}
		
		

	}

}
