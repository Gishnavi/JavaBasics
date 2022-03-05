package test;

import java.util.Scanner;

public class Test1 {
	int a;
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Test1 result = new Test1();
     result.a = sc.nextInt();
//     check whether a is odd or even
     if(result.a % 2==0) {
    	 System.out.println("It is an even number");
     }
     else {
    	 System.out.println("It is an odd number");
     }
     }

}
