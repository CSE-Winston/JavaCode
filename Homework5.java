//Winston Jiang Li
import java.util.Scanner;

public class Homework5 {

		// TODO Auto-generated method stub
		 //variables
	    private String name;            // Name of the coffee
	    private int caffeineContent;     // Caffeine content in mg

	    //constructor
	    public Homework5() {
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
	        if (name != null && !name.trim().isEmpty()) { //Making sure it's non-null and that's it's not empty
	            this.name = name;
	        } else {
	            System.out.println("Coffee name cannot be null or empty."); // Error message
	        }
	    }

	    // Mutator for caffeine 
	    public void setCaffeineContent(int caffeineContent) {
	        if (caffeineContent >= 50 && caffeineContent <= 300) { // Check's if it's in the right range.
	            this.caffeineContent = caffeineContent;
	        } else {
	            System.out.println("Caffeine content must be between 50 and 300 mg."); // Message for if it isn't in the right range.
	        }
	    }

	    // Calculates the number of cups before it's risky
	    public double riskyAmount() {
	        return 180.0 / ((caffeineContent / 100.0) * 6.0);
	    }

	    // compares the two coffee
	    public boolean equals(Homework5 other) {
	        return this.name.equals(other.name) && this.caffeineContent == other.caffeineContent;
	    }

	    @Override
	    public String toString() {
	        return "Coffee Name: " + name + "\nCaffeine Amount: " + caffeineContent;
	    }

	    // Main method for the class
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 
	        boolean continueProgram = true; 

	        System.out.println("Welcome to the Coffee Hour!!!"); // Welcome message

	        while (continueProgram) {
	            // Create two Coffee objects
	            Homework5 coffee1 = new Homework5();
	            Homework5 coffee2 = new Homework5();

	            // Input for the first coffee
	            System.out.print("What’s the name of the first coffee?\n");
	            coffee1.setName(scanner.nextLine()); // name for the first coffee

	            System.out.print("What’s the caffeine content?\n");
	            int caffeine1 = scanner.nextInt();
	            coffee1.setCaffeineContent(caffeine1); //caffeine for the first coffee
	            scanner.nextLine();

	            // output for the first coffee
	            System.out.println(coffee1.toString());
	            System.out.printf("It would take %.1f cups of %s before it’s dangerous to drink more.\n",
	                    coffee1.riskyAmount(), coffee1.getName());

	            // Input for the second coffee
	            System.out.print("What’s the name of the second coffee?\n");
	            coffee2.setName(scanner.nextLine()); // name for the second coffee

	            System.out.print("What’s the caffeine content?\n");
	            int caffeine2 = scanner.nextInt();
	            coffee2.setCaffeineContent(caffeine2); // Caffeine content for the second coffee
	            scanner.nextLine(); // Consume leftover newline

	            // Output for the second coffee
	            System.out.println(coffee2.toString());
	            System.out.printf("It would take %.1f cups of %s before it’s dangerous to drink more.\n",
	                    coffee2.riskyAmount(), coffee2.getName());

	            // Checking if both the coffee are the same.
	            System.out.printf("Are both coffee’s the same? %b \n", coffee1.equals(coffee2));

	            // Ask to continue or not.
	            System.out.print("Do you want to create more coffee objects? Enter “Yes” or “No”: \n");
	            String userInput = scanner.nextLine();
	            continueProgram = userInput.equalsIgnoreCase("Yes"); // Control loop based on user input
	        }

	        scanner.close();

	}

}
