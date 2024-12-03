//Winston Jiang Li
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String first = key.nextLine();	
		
		System.out.println("Enter Last Name: ");
		String last = key.nextLine();
		
		System.out.println("Enter your age: ");
		int age = key.nextInt();
		// Separating the phone number so that i'll be able to reformat it at a later time
		System.out.println("Enter Phone Number without dashes or parenthesis.");
		System.out.println("Enter your area code (first three digits): ");
		int phonenumberfirst = key.nextInt();
		
		System.out.println("Enter the next three digits: ");
		int phonenumbersecond = key.nextInt();
		
		System.out.println("Enter last four digits: ");
		int phonenumberthird = key.nextInt();
		//Using this to separate the int and string since it was messing with the input.
		key.nextLine();
		
		System.out.println("Enter your major:");
		String major = key.nextLine();
		
		System.out.println("Enter your Year (Freshman, Sophomore, Junior, or Senior): ");
		String year = key.nextLine();
		// Having them individually input values for the date so it can also be reformatted at the end.
		System.out.println("Enter the month: ");
		int month = key.nextInt();
		
		System.out.println("Enter the day: ");
		int day = key.nextInt();
		
		System.out.println("Enter the year: ");
		int dateyear = key.nextInt();
		
		key.nextLine();
		
		System.out.println("What is a hobby of yours?");
		String hobby = key.nextLine();
		
		System.out.println("What is place you want to travel to?");
		String travel = key.nextLine();
		
		System.out.println("What is a musical instrument you want to learn?");
		String music = key.nextLine();
		// Created a variable where the birth year is calculated for me.
		int birth = dateyear - age;
		
		System.out.println("Here's an quick intro for " +first+" "+last+ ":" );
		// Using these to add an line of empty space in between.
		System.out.println();
		
		System.out.println("You were born in the year "+ birth +". You have a hobby of "+ hobby + ". A place that you always wanted to travel to is " + travel + ". An musical instrument that you want to learn is "+music+". You are a "+year+" at USC majoring in " +major+ ". You can be reached at ("+phonenumberfirst+")"+phonenumbersecond+"-"+phonenumberthird+". You are now offically a Gamecock!");
		
		System.out.println();
		
		System.out.println("Last Updated: "+day+"/"+month+"/"+dateyear);
		
		

	}

}
