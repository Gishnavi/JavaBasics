package test;

import java.util.Scanner;

public class Practise {
	int a;
	int b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Practise result = new Practise();
		result.a = sc.nextInt();
		result.b = sc.nextInt();
		System.out.println(result.a/result.b);
//		System.out.println("hello");

		// Practise result = new Practise();
//           System.out.println(result.a+result.b);

	}
}
