//Winston jiang Li
import java.util.Scanner;

class Apple {
//variables
private String type;
private double weight;
private double price;

//Constructor
public Apple() {
    //default values
    type = "Gala";
    weight = 0.5;
    price = 0.88;
 }

 //parameterized Constructor
public Apple(String xType, double xWeight, double xPrice) {
     //instance variables using mutator methods with validation
     setType(xType);
     setWeight(xWeight);
     setPrice(xPrice);
 }

 // Accessors
public String getType() {
    return type;
 }

public double getWeight() {
    return weight;
 }

public double getPrice() {
    return price;
 }

 //mutators with validation
public void setType(String xType) {
    if (xType.equals("Red Delicious") || xType.equals("Golden Delicious") || xType.equals("Gala") || xType.equals("Granny Smith")) {
        type = xType;
    } else {
        System.out.println("Invalid value for type!");
    }
 }

public void setWeight(double xWeight) {
    if (xWeight >= 0 && xWeight <= 2) {
        weight = xWeight;
    } else {
        System.out.println("Invalid value for weight!");
     }
 }

public void setPrice(double xPrice) {
     if (xPrice >= 0) {
         price = xPrice;
     } else {
         System.out.println("Invalid value for price!");
     }
 }

 //output display
public void writeOutput() {
    System.out.println("Type: " + type);
    System.out.println("Weight: " + weight + " kg");
    System.out.println("Price: $" + price);
 	}
}

//AppleTester class
public class AppleTester {
	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Welcome to the Apple tester!!!");

     //default constructor
     System.out.println("\nCreating the first apple!");
     Apple firstApple = new Apple();

     //Display values of the first apple
     System.out.println("Default values of the first apple object:");
     firstApple.writeOutput();

     //inputs from the user to create the second apple.
     System.out.println("\nEnter the type of the second apple object:");
     String type = input.nextLine();
     System.out.println("Enter the weight of the second apple object:");
     double weight = input.nextDouble();
     System.out.println("Enter the price of the second apple object:");
     double price = input.nextDouble();

     input.nextLine();

     System.out.println("\nCreating the second apple object!");
     Apple secondApple = new Apple(type, weight, price);

     //output for the second apple.
     System.out.println("Values of the second apple object:");
     secondApple.writeOutput();

     input.close();
	}
}