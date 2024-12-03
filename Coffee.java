//Winston Jiang Li

import java.util.Scanner;

public class Coffee {
		// Instance variables
	    private String name;            // Name of the coffee
	    private int caffeineContent;     // Caffeine content in mg

	    // Default constructor
	    public Coffee() {
	        this.name = "none";          // Default coffee name
	        this.caffeineContent = 50;   // Default caffeine content
	    }

	    // Accessor for name
	    public String getName() {
	        return name;
	    }

	    // Accessor for caffeine content
	    public int getCaffeineContent() {
	        return caffeineContent;
	    }

	    // Mutator for name
	    public void setName(String name) {
	        if (name != null && !name.trim().isEmpty()) { // Ensure name is non-null and not empty
	            this.name = name;
	        } else {
	            System.out.println("Coffee name cannot be null or empty."); // Error message
	        }
	    }

	    // Mutator for caffeine content
	    public void setCaffeineContent(int caffeineContent) {
	        if (caffeineContent >= 50 && caffeineContent <= 300) { // Validate caffeine range
	            this.caffeineContent = caffeineContent;
	        } else {
	            System.out.println("Caffeine content must be between 50 and 300 mg."); // Error message
	        }
	    }

	    // Calculates the number of cups before health risk
	    public int riskyAmount() {
	        return (int) (180.0 / ((caffeineContent / 100.0) * 6.0));
	    }

	    // Equals method to compare two Coffee objects
	    public boolean equals(Coffee other) {
	        return this.name.equals(other.name) && this.caffeineContent == other.caffeineContent;
	    }

	    // toString method to represent Coffee object as a String
	    @Override
	    public String toString() {
	        return "Name: " + name + "\nCaffeine Amount: " + caffeineContent + " mg";
	    }

	    // Main method to test the Coffee class
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Create scanner for user input
	        boolean continueProgram = true; // Control variable for the main loop

	        while (continueProgram) {
	            // Create two Coffee objects
	            Coffee coffee1 = new Coffee();
	            Coffee coffee2 = new Coffee();
	            
	            System.out.println("Welcome to the Coffee Hour!!!");

	            // Input for the first coffee
	            System.out.print("Enter the name of the first coffee: ");
	            coffee1.setName(scanner.nextLine()); // Set name for first coffee

	            System.out.print("Enter the caffeine content of the first coffee (50-300 mg): ");
	            int caffeine1 = scanner.nextInt();
	            coffee1.setCaffeineContent(caffeine1); // Set caffeine content for first coffee
	            scanner.nextLine(); // Consume leftover newline

	            // Input for the second coffee
	            System.out.print("Enter the name of the second coffee: ");
	            coffee2.setName(scanner.nextLine()); // Set name for second coffee

	            System.out.print("Enter the caffeine content of the second coffee (50-300 mg): ");
	            int caffeine2 = scanner.nextInt();
	            coffee2.setCaffeineContent(caffeine2); // Set caffeine content for second coffee
	            scanner.nextLine(); // Consume leftover newline

	            // Print properties of each coffee
	            System.out.println("\nCoffee 1 Properties:");
	            System.out.println(coffee1.toString());
	            System.out.println("Cups before health risk: " + coffee1.riskyAmount());

	            System.out.println("\nCoffee 2 Properties:");
	            System.out.println(coffee2.toString());
	            System.out.println("Cups before health risk: " + coffee2.riskyAmount());

	            // Check if both coffees are the same
	            if (coffee1.equals(coffee2)) {
	                System.out.println("\nBoth coffees are the same.");
	            } else {
	                System.out.println("\nThe coffees are different.");
	            }

	            // Prompt to continue or stop
	            System.out.print("\nDo you want to enter more coffees? (yes/no): ");
	            String userInput = scanner.nextLine();
	            continueProgram = userInput.equalsIgnoreCase("yes"); // Control loop based on user input
	        }

	        scanner.close(); // Close the scanner to avoid resource leaks
	        System.out.println("Program has ended."); // End message

	}

}
