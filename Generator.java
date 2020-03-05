/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.lab1;

import java.util.Scanner;

public class Generator {

 public void gcal() {
		System.out.println("Generator Calculator\nWhich operation you want to do?");
		System.out.println("1. Add (+)\n2. Sub(-)\n3. Multi(*)\n4. Div(/)"
				+ "\n5. Mod(%)\n6. Squ(x^2)\n");
		Scanner number = new Scanner (System.in);
		int num = number.nextInt();
		switch(num) {
		case 1:
			System.out.println("Enter First Number:");
			double a = number.nextDouble();
			System.out.println("Enter Last Number: ");
			double b = number.nextDouble();
			double sum = a+b;
			System.out.println("Addition of two numbers is: "+sum);
			break;
			
		case 2:
			System.out.println("Enter First Number: ");
			a = number.nextDouble();
			System.out.println("Enter Last Number: ");
			b = number.nextDouble();
			double sub = a-b;
			System.out.println("Subtraction of two numbers is: "+sub);
			break;
			
		case 3: 
			System.out.println("Enter First Number: ");
			a = number.nextDouble();
			System.out.println("Enter Last Number: ");
			b = number.nextDouble();
			double mul = a*b;
			System.out.println("Multiplication of two numbers is: "+mul);
			break;
			
		case 4: 
			System.out.println("Enter First Number: ");
			a = number.nextDouble();
			System.out.println("Enter Last Number: ");
			b = number.nextDouble();
			double div = a/b;
			System.out.println("Division of two numbers is: "+div);
			break;
			
		case 5: 
			System.out.println("Enter First Number: ");
			a = number.nextDouble();
			System.out.println("Enter Last Number: ");
			b = number.nextDouble();
			double mod = a%b;
			System.out.println("Modulus of two numbers is: "+mod);
			break;
		
		case 6: 
			System.out.println("Enter Number: ");
			a = number.nextDouble();
			double sqr = a*a;
			System.out.println("Square of the number is: "+sqr);
			break;
			
		case 7:
			System.out.println("Enter Number: ");
			a = number.nextDouble();
			double root = Math.sqrt(a);
			System.out.println("Root of the number: "+root);
			break;
			
		default:
			System.out.println("Try Again.");
			break;
		}
		
	}
	

}