package Testing;

import java.util.Scanner;

public class Calculator {
	public int factorial(int n) {
		if(n == 0 || n == 1)
			return 1;
		return n*factorial(n-1);
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your number:");
//		int n = sc.nextInt();
//		System.out.println("Factorial of: " + n + " is " + new Calculator().factorial(n));
//	}
}
