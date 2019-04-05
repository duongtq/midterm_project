package hust.soict.ictglobal.lab02;
import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		double height;
		
		System.out.println("What is your name ?");
		name = keyboard.nextLine();
		
		System.out.println("How old are you ?");
		age = keyboard.nextInt();
		
		System.out.println("How tall are you ?");
		height = keyboard.nextDouble();
		
		System.out.println("Mrs/Mr." + name + ", " + age + " years old.");
		System.out.println("Your height: " + height);
		
		keyboard.close();
	}

}
