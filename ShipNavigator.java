// Winston Jiang Li

import java.util.Scanner;

// Ship class
class Ship {
    private String name;
    private String launchDate;

    // Constructor
    public Ship(String name, String launchDate) {
        this.name = name;
        setLaunchDate(launchDate); 
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchDate(String launchDate) {
        int year = Integer.parseInt(launchDate.split("/")[2]);
        if (year >= 1990 && year <= 2019) {
            this.launchDate = launchDate;
        } else {
            System.out.println("Error: Launch date prior to 1990. Resetting Astoria's launch date to the default 01/01/1990");
        }
    }

    public String toString() {
        return "Name: " + name + "\nLaunch Date: " + launchDate;
    }
}

// CruiseShip class
class CruiseShip extends Ship {
    private int passengerCapacity;
    private int crewMembers;

    // Constructor
    public CruiseShip(String name, String launchDate, int passengerCapacity, int crewMembers) {
        super(name, launchDate); // Call superclass constructor
        this.passengerCapacity = passengerCapacity;
        this.crewMembers = crewMembers;
    }

    // Accessors
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCrewMembers() {
        return crewMembers;
    }

    // Mutators
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setCrewMembers(int crewMembers) {
        this.crewMembers = crewMembers;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nPassenger Capacity: " + passengerCapacity + 
               "\nCrew: " + crewMembers;
    }
}

// CargoShip class
class CargoShip extends Ship {
    private double tonnage;
    private double maxSpeed;

    // Constructor
    public CargoShip(String name, String launchDate, double tonnage, double maxSpeed) {
        super(name, launchDate); // Call superclass constructor
        this.tonnage = tonnage;
        this.maxSpeed = maxSpeed;
    }

    // Accessors
    public double getTonnage() {
        return tonnage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    // Mutators
    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nTonnage: " + tonnage + " DWT" + 
               "\nMaximum Speed: " + maxSpeed + " mph";
    }
}

// ShipNavigator class
public class ShipNavigator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        System.out.println("Welcome to ShipNavigator!!!");

        while (continueProgram) {
            // Ship details
            System.out.print("Enter the name of the ship:\n");
            String shipName = scanner.nextLine();

            System.out.print("Enter its launch date (mm/dd/yyyy):\n");
            String launchDate = scanner.nextLine();

            System.out.print("Is it a cruise ship or a cargo ship?\n");
            String shipType = scanner.nextLine().toLowerCase();

            if (shipType.equals("cruise ship")) {

                System.out.print("Enter the ship's passenger capacity:\n");
                int passengerCapacity = scanner.nextInt();

                System.out.print("How many crew members are on this ship?\n");
                int crewMembers = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Creating a cruise ship...");
                CruiseShip cruiseShip = new CruiseShip(shipName, launchDate, passengerCapacity, crewMembers);
                System.out.println("Printing the ship's details:");
                System.out.println(cruiseShip);
            } else if (shipType.equals("cargo ship")) {

                System.out.print("Enter the ship's tonnage (DWT):\n");
                double tonnage = scanner.nextDouble();

                System.out.print("Enter the maximum speed of the ship (in mph):\n");
                double maxSpeed = scanner.nextDouble();
                scanner.nextLine(); 

                System.out.println("Creating a cargo ship...");
                CargoShip cargoShip = new CargoShip(shipName, launchDate, tonnage, maxSpeed);
                System.out.println("Printing the ship's details:");
                System.out.println(cargoShip);
            } else {
                System.out.println("Invalid ship type! Please enter 'Cruise ship' or 'Cargo ship'.");
                continue;
            }

            // Ask if they want to construct another ship
            System.out.print("Do you want to construct another ship object? Enter yes or no:\n");
            String userResponse = scanner.nextLine().toLowerCase();

            if (userResponse.equals("no")) {
                continueProgram = false;
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
