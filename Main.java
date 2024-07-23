import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Array Example with user input
        System.out.println("Array Example:");
        int[] intArray = new int[5]; // Declaring an array of fixed size 5

        for (int i = 0; i < intArray.length; i++) 
        {
            while (true) 
            {
                try 
                {
                    System.out.print("Enter an integer for array element at index " + i + ": ");
                    intArray[i] = scanner.nextInt();
                    break; // Exit loop if input is valid
                } 
                catch (InputMismatchException e) 
                {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Clear the invalid input
                }
            }
        }

        // Iterating over the array using a for loop
        for (int i = 0; i < intArray.length; i++) 
        {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        // ArrayList Example with user input
        System.out.println("\nArrayList Example:");
        ArrayList<Integer> intList = new ArrayList<>(); // Declaring an ArrayList
        
        while (true) 
        {
            System.out.print("Enter an integer to add to the ArrayList (or type 'done' to finish): ");
            try 
            {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) 
                {
                    break;
                }
                intList.add(Integer.parseInt(input));
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        // Iterating over the ArrayList using a for loop
        for (int i = 0; i < intList.size(); i++) 
        {
            System.out.println("Element at index " + i + ": " + intList.get(i));
        }

        // Demonstrating dynamic resizing of ArrayList
        while (true) 
        {
            System.out.print("\nEnter another integer to add to the ArrayList (or type 'done' to finish): ");
            try 
            {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) 
                {
                    break;
                }
                intList.add(Integer.parseInt(input));
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        System.out.println("\nAfter adding more elements to the ArrayList:");
        for (int i = 0; i < intList.size(); i++) 
        {
            System.out.println("Element at index " + i + ": " + intList.get(i));
        }
        
        scanner.close();
    }
}
