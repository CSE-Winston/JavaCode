// WInston Jiang Li
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		String response; // setting string variable for response.
		int door; // setting int variable for later on.
		
		System.out.println("Welcome to the Choose your own adventure!");
		
		System.out.println("You're starting point is in a remote town. Please choose to rest, gear up, or head to the dungeon. Enter \"rest\", \"gear\", or \"dungeon\"");
		
		response = key.next();
		
		if(response.equals("rest")) //Creating the first if statement for mine first option.
		{
			System.out.println("You head to an inn in the town and when you get there you can choose to pay for a room to rest or you can pay to get some food. Enter \"room\" or \"food\" ");
			response = key.next();
			if(response.equals("room")) // ensuring all these if statements are in the right locations.
			{
				System.out.println("You paid for a room and went to sleep.");
			}
			if(response.equals("food"))
			{
				System.out.println("You ask the waiter for food and after you finished your food. You can now choose to go rest or leave the town. Enter \"rest\" or \"leave\"");
				response = key.next();
				if(response.equals("rest"))
				{
					System.out.println("You paid for a room and went to sleep.");
				}
				if(response.equals("leave"))
				{
					System.out.println("You decided to leave the town without doing anything.");
				}
			}
			
		}
		if(response.equals("dungeon")) // My second option wrote in if statements
		{
			System.out.println("You went to the dungeon gate and the guard sees you with no weapon and tells you to leave.");
			System.out.println("You did nothing!");
		}
		if(response.equals("gear")) // My third option also wrote in if statements.
		{
			System.out.println("You decided to go the blacksmith and now you can choose to get a sowrd or a shield. Enter \"sword\" or \"shield\"");
			response = key.next();
			if(response.equals("sword"))
			{
				System.out.println("You have now aqquired a sword. You can now head to the dungeon. Enter \"yes\" or \"no\"");
				response = key.next();
				if(response.equals("yes"))
				{
					System.out.println("You head to dungeon and you are now faced with 3 doors. Enter 1, 2 or 3.");
					door = key.nextInt();
					if(door < 1 || door > 3) // A choice where I ensure that the only 3 numbers can be picked and if it's not those three then it would quit.
					{
						System.out.println("Invalid number entered. Exiting the game!");
						System.exit(0);
					}
					if(door == 1)
					{
						System.out.println("You opened the door and headed down the hallway but the ground breaks under you and you fell onto a spike trap.");
						System.out.println("You died!");
					}
					if(door == 2)
					{
						System.out.println("You opened the door and headed down the hallway. Out of nowhere a goblin jumps out and attacked you. Do you choose to fight it or run away. Enter \"fight\" or \"run\"");
						response = key.next();
						if(response.equals("fight"))
						{
							System.out.println("You decided to fight the goblin and you kill him but got injuried. Do you continue down the hallway. Enter \"yes\" or \"no\"");
							response = key.next();
							if(response.equals("yes"))
							{
								System.out.println("You continue down the hallway and found the treasure.");
								System.out.println("Congraulation you won!");
							}
							if(response.equals("no"))
							{
								System.out.println("You left the dungeon with nothing but injuries.");
								System.out.println("You lose!");
							}
						if(response.equals("run"))
						{
							System.out.println("You started to run away but the goblin was faster than you. You get hit from behind and died.");
							System.out.println("You died!");
						}
					if(door == 3)
					{
						System.out.println("You opened the door and head down the hallway, but all it was is just a dead end.");
						System.out.println("You headed back gaining nothing!");
					}
			if(response.equals("shield"))
			{
				System.out.println("The blacksmith called you a coward and throw you out of his shop.");
				System.out.println("You did nothing!");
			}
						}
					}
				}
			}
		}

	}

}
