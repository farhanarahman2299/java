/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.lab1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CalculatorLab1 {

    /**
     * @param args the command line arguments
     */
  

	public static void main(String[] args) {
		System.out.print("Which calculator do you want to use?\n1. Generator\n2. Scientific\n");
		Scanner cal = new Scanner(System.in);
		int a = cal.nextInt();
            switch (a) {
                case 1:
                    Generator gc = new Generator();
                    gc.gcal();
                    break;
                case 2:
                    Scientific sc = new Scientific();
                    sc.scal();
                    break;
                default:
                    System.out.println("Try Again.");
                    break;
            }
			

	}

}
   
