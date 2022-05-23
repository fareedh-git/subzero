package learning;

import java.util.Scanner;

public class userinput {
public static void main(String[]args) {
	Scanner scanner= new Scanner(System.in); //gets input
	System.out.println("whats your name?");  //prints first
	String name= scanner.nextLine(); //after next line
	System.out.println("how old are you?");
	int age = scanner.nextInt();
	scanner.nextLine();
	System.out.println("i like");
	String food= scanner.nextLine();
	
	
	
System.out.println("hello"+ name);
System.out.println("you are "+age+"years old");
System.out.println("you like "+ food);
	
	
	
}
}