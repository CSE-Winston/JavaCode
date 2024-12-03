//Winston Jiang Li
import java.util.Scanner;
public class Homework4 {
	// Function for sorting into Smallest to Largest(Ascending order)
	public static void sortAscend(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

	// Function for sorting into Largest to Smallest(Descending order)
    public static void sortDescend(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static boolean isUnique(double[] arr, double value, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		//Enter the amount of circle to input
		System.out.println("Enter the size of the collection:");
        int coll = key.nextInt();
        while (coll <= 0) {
            System.out.println("Invalid size. Please enter a positive number:");
            coll = key.nextInt();
        }

        double[] radArr = new double[coll];
        int uniqueCount = 0;

        System.out.println("Enter the radii (unique values only):");
        while (uniqueCount < coll) {
            double radius = key.nextDouble();
            if (isUnique(radArr, radius, uniqueCount)) {
                radArr[uniqueCount] = radius;
                uniqueCount++;
            } else {
                System.out.println("Radius already entered. Please enter a unique radius:");
            }
        }

        double[] areaArr = new double[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            areaArr[i] = Math.PI * radArr[i] * radArr[i];
        }

     // Chose in which order to sort
        System.out.println("Choose the sorting order:");
        System.out.println("1 - Ascending Order");
        System.out.println("2 - Descending Order");
        int order = key.nextInt();
        
        switch (order) {
        case 1:
            sortAscend(areaArr);
            System.out.println("Circle areas sorted in Ascending Order:");
            break;
        case 2:
            sortDescend(areaArr);
            System.out.println("Circle areas sorted in Descending Order:");
            break;
        default:
            System.out.println("Invalid choice. Sorting in Ascending Order by default.");
            sortAscend(areaArr);
    }
     // Display the Array as Chosen sorted order
    for (double area : areaArr) {
        System.out.print(area + " ");
    	}
	}
}