package com.simplilearn;
import java.util.*;

public class calculator {

	public static void main(String[] args) {
		char operator;
		int a,b,result;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first number:");
		 a= sc.nextInt();
		
		System.out.print("Enter second number:");
		 b= sc.nextInt();
		
		System.out.println("Which operation,you want to perform: +,-,*,/,%");
		operator = sc.next().charAt(0);
		
		
		switch (operator) {
		case '+':
			System.out.print("Addition of two number is:");
			result=a+b;
			System.out.println(result);
			break;
			
		case '-':
			System.out.print("Subtraction of two number is:");
			result=a-b;
			System.out.println(result);
			break;
		
		case '*':
			System.out.print("Multiplication of two number is:");
			result=a*b;
			System.out.println(result);
			break;
		
		case '/':
			System.out.print("Division of two number is:");
			result=a/b;
			System.out.println(result);
			break;
			
		case '%':
			System.out.print("Modulus of two number is:");
			result=a%b;
			System.out.println(result);
			break;
		
		default:
			System.out.print("Invalid operator");
		
		
			
		
		
		}
			
		

	}

}
