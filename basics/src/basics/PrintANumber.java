package basics;

import java.util.Scanner;

public class PrintANumber {

	public static void main(String[] args) {
		//creates a reader instance which takes
		//input from standard input - keyboard
		Scanner reader=new Scanner(System.in);
		System.out.println("enter a number: ");
				//nextInt() reads the next integer from the keyboard
		int number =reader.nextInt();
		// println print the following in output screen
		System.out.println("you entered :"+ number);
	}

}
