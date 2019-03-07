package hust.soict.ictglobal.lab01;

import java.util.Scanner;

public class EquationSolver
{
	public static double SolveFirstDegreeEquationOneVar(double a, double b, double c)
	{
		double result = 0;
		
		if ( a != 0 )
		{
			result = (c - b)/a;
		}
		else if ( a == 0 )
		{
			if ( b == c )
			{
				result = 99999; // the equation has countless solutions 
			}
			else
			{
				result = -1; // the equation has no solution
			}
		}
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		
		double a = keyboard.nextDouble();
		
		System.out.print("Enter b: ");
		
		double b = keyboard.nextDouble();
		
		System.out.print("Enter c: ");
		
		double c = keyboard.nextDouble();
		
		double result = SolveFirstDegreeEquationOneVar(a, b, c);
		
		if ( result == 99999 )
		{
			System.out.println("The equation has countless solutions.");
		}
		else if ( result == -1 )
		{
			System.out.println("The equation no solutions.");
		}
		else
		{
			System.out.println("Result: x = " + result);
		}
		
		keyboard.close();
	}

	

}