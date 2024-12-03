//Winston Jiang Li

import java.util.Scanner;

// TimeException class
class TimeException extends Exception {
    // Default constructor
    public TimeException() {
        super("EXCEPTION: Invalid time entered!");
    }

    // Parameterized constructor
    public TimeException(String message) {
        super(message);
    }
}

// TimeConverter class
class TimeConverter {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean notPM; 

    // Default constructor
    public TimeConverter() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.notPM = true;
    }

    // Parameterized constructor
    public TimeConverter(int hours, int minutes, int seconds) throws TimeException {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Accessors 
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isNotPM() {
        return notPM;
    }

    // Mutators 
    public void setHours(int hours) throws TimeException {
        if (hours < 0 || hours > 23) {
            throw new TimeException("Invalid hour value. Must be between 0 and 23.");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) throws TimeException {
        if (minutes < 0 || minutes > 59) {
            throw new TimeException("Invalid minute value. Must be between 0 and 59.");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws TimeException {
        if (seconds < 0 || seconds > 59) {
            throw new TimeException("Invalid second value. Must be between 0 and 59.");
        }
        this.seconds = seconds;
    }

    public void setNotPM(boolean notPM) {
        this.notPM = notPM;
    }

    // method to convert 24 hours time to 12 hour time
    public void updateTime(int hours, int minutes, int seconds) throws TimeException {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);

        // Convert to 12-hour format
        if (hours == 0) {
            this.hours = 12; 
            this.notPM = true; 
        } else if (hours > 0 && hours < 12) {
            this.notPM = true; 
        } else if (hours == 12) {
            this.notPM = false; 
        } else if (hours > 12 && hours <= 23) {
            this.hours = hours - 12; 
            this.notPM = false;
        }
    }

    public void updateTime(String time) throws TimeException {
        try {
            String[] parts = time.split(":");
            if (parts.length != 3) {
                throw new TimeException("Invalid time format. Please use 'hours:minutes:seconds'.");
            }
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);
            updateTime(hours, minutes, seconds);
        } catch (NumberFormatException e) {
            throw new TimeException("Invalid time input. Please enter valid integers.");
        }
    }

    // method to display 12 hour time
    public void displayTime() {
        String timeOfDay = (notPM) ? "AM" : "PM";
        String formattedTime = String.format("%d:%02d:%02d %s", hours, minutes, seconds, timeOfDay);
        System.out.println("12-hour clock time → " + formattedTime);
    }
}

// ClockTimeDemo class
public class ClockTimeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Convert military time into 12-hour clock time!!!");

        // Loop
        while (true) {
            try {
                // First ask the user for hours, minutes, and seconds in 24-hour format
                System.out.println("Enter the hours on the military clock:");
                int hours = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the minutes on the military clock:");
                int minutes = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the seconds on the military clock:");
                int seconds = Integer.parseInt(scanner.nextLine());

                TimeConverter timeConverter = new TimeConverter();
                timeConverter.updateTime(hours, minutes, seconds);
                timeConverter.displayTime();

                // Ask user for the time in "hh:mm:ss" format
                System.out.println("Enter 24 hour clock time in the format “hours:minutes:seconds”");
                String inputTime = scanner.nextLine();
                timeConverter.updateTime(inputTime);
                timeConverter.displayTime();

            } catch (TimeException e) {
                System.out.println(e.getMessage());
            }

            // Ask user if they want to continue
            System.out.println("Would you like to do this again? Enter “Yes” or “No”:");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Exiting the program!");
                break;
            }
        }

        scanner.close();
    }
}