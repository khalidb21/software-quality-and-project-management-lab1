package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		
		// Create a scanner object for user input
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("Enter first binary number: ");
		Binary binary1 = new Binary(scanner.nextLine());
		System.out.println("First binary number is " + binary1.getValue());
		
		System.out.print("Enter second binary number: ");
		Binary binary2 = new Binary(scanner.nextLine());
		System.out.println("Second binary number is " + binary2.getValue());
		
		System.out.println("\nAvailable operations: add, or, and, multiply");
		System.out.print("Enter operation: ");
		String operation = scanner.nextLine().toLowerCase();
		
		Binary result = null;
		switch(operation) {
			case "add":
				result = Binary.add(binary1, binary2);
				break;
			case "or":
				result = Binary.bitwiseOR(binary1, binary2);
				break;
			case "and":
				result = Binary.bitwiseAND(binary1, binary2);
				break;
			case "multiply":
				result = Binary.multiply(binary1, binary2);
				break;
			default:
				System.out.println("Invalid operation");
				scanner.close();
				return;
		}
		
		System.out.println("Result: " + result.getValue());
		scanner.close();

    }
}