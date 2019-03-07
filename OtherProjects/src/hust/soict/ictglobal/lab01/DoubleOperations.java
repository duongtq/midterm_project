package hust.soict.ictglobal.lab01;

import java.util.Scanner;

public class DoubleOperations
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the first number: ");

		double num1 = keyboard.nextDouble();

		System.out.print("Enter the second number: ");

		double num2 = keyboard.nextDouble();

		double sum      = num1+num2;
		double diff     = num1-num2;
		double product  = num1*num2;
		double quotient = num1/num2;

		String strNum1 = Double.toString(num1);
		String strNum2 = Double.toString(num2);

		System.out.println(strNum1 + " + " + strNum2 + " = " + sum);
		System.out.println(strNum1 + " - " + strNum2 + " = " + diff);
		System.out.println(strNum1 + " * " + strNum2 + " = " + product);
		System.out.println(strNum1 + " / " + strNum2 + " = " + quotient);
		
		keyboard.close();
	}
}