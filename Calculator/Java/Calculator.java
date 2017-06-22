import java.io.File;
import java.util.Scanner;

public class Calculator 
{
	public static boolean exit = false;
	public static Scanner input;
	public static boolean startRun = true;
	
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(new File("logo.txt"));
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			System.out.println("Developed by Noah Sherry");
			System.out.println("Found a bug? Enter \"Bug\" during operation selection.");
			for(int i=0;i<2;i++)System.out.println();
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			Start();
		}
		catch(Exception e)
		{
			System.out.println("Uh oh! Looks like you found a bug!");
			System.out.println("Please email a detailed report to sherryn18@asmsa.org.");
			System.out.println("The report should contain a copy of the error, and steps required to duplicate it.");
			System.out.println();
			System.out.println("Thank you for using Awesome Calculator!");
			System.exit(0);
		}
		
	}
	
	public static void Start()
	{
		System.out.println("What operation would you like to perform? (Enter EXIT to quit.)");
		System.out.println("add / subtract / multiply / divide / exponent");
		String entry;
		entry = getInput();
		
		
		if(entry.toLowerCase().equals("exit"))
		{
			System.out.println("Thank you for using Awesome Calculator!");
			System.exit(0);
		}
		
		if(entry.toLowerCase().equals("bug"))
		{
			System.out.println("Please email a detailed report to sherryn18@asmsa.org.");
			System.out.println("The report should contain a copy of the error, and steps required to duplicate it.");
			System.out.println();
			System.out.println("Thank you for using Awesome Calculator!");
			System.exit(0);
		}
		Calculate(entry);
		Start();
	}
	
	public static String getInput()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void Calculate(String op)
	{
		op = op.toLowerCase();
		
		switch(op)
		{
			case "add":
			{
				double num1 = 0;
				double num2 = 0;
				double answer;
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Please enter your first number: ");
				try {
				    num1 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				System.out.print("Please enter your second number: ");
				try {
				    num2 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				System.out.println();
				answer = num1 + num2;
				System.out.println("Answer: " + answer);
			}
			break;
			
			case "subtract":
			{
				double num1 = 0;
				double num2 = 0;
				double answer;
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Please enter your first number: ");
				try {
				    num1 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				System.out.print("Please enter your second number: ");
				try {
				    num2 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				System.out.println();
				answer = num1 - num2;
				System.out.println("Answer: " + answer);
			}
			break;
			
			case "multiply":
			{
				double num1 = 0;
				double num2 = 0;
				double answer;
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Please enter your first number: ");
				try {
				    num1 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				System.out.print("Please enter your second number: ");
				try {
				    num2 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				System.out.println();
				answer = num1 * num2;
				System.out.println("Answer: " + answer);
			}
			break;
			
			case "divide":
			{
				double num1 = 0;
				double num2 = 0;
				double answer;
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Please enter the base number: ");
				try {
				    num1 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				System.out.print("Please enter the divisor: ");
				try {
				    num2 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				if(num2 == 0)
				{
					System.out.println("Error: Cannot divide by zero. :(");
					System.out.println();
				}
				else
				{
					answer = num1 / num2;
					System.out.println("Answer: " + answer);
				}
			}
			break;
			
			case "exponent":
			{
				double num1 = 0;
				double num2 = 0;
				double answer;
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Please enter the base: ");
				try {
				    num1 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				System.out.print("Please enter the exponent: ");
				try {
				    num2 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				}
				answer = Math.pow(num1, num2);
				System.out.println("Answer: " + answer);
			}
			break;
			
			default:
			{
				System.out.println("Error: Incorrect Input.");
				System.out.println();
			}
		}
	}

}
