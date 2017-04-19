/*
 * Example of implementation of Binary Search on an array with integer values.
 * @author Frederik Vermaete
 *
 * Binary Search is a way to search more efficiently for data in a SORTED array.
 * Instead of going through the numbers one by one, binary search will focus on
 * the middle part of an array, by first checking the value of the item there.
 * Then the search will continue on either the left or right part of the remainder of items.
 * If the searched value is smaller than the value of the middle item, the search will continue
 * on the left part of the array, and vice-versa.
 * Thus, each step of the Binary Search will half down the area to be searched.
 * If the data is not found, the search will continue with the remaining part of the array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {

    // Testing the BinarySearch class here.
    public static void main(String[] args) {
        
        // The input is predefined as an ALREADY SORTED array.
        // Binary search would not work without a sorted array!
        int[] array = { -50, -30, -20, -10, -5, -1, 1, 2, 20, 30, 50, 75, 80, 85, 90, 100, 110, 125, 132, 520, 1120, 8990 };
        //int[] array = { 0, 1, 2, 3, 4, 6, 7, 8, 9, 11 };
        

        Scanner reader = new Scanner(System.in);

        // Presenting the array to the screen
        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println("Length of the given array: " + array.length);
        System.out.println();

        // Asking for a value that needs to be searched
        System.out.print("Enter number to be searched: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        // Putting the search result (true/false) into a variable.
        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        // Presenting the result onthe screen.  Boolean condition (result)
        System.out.println(result ? "Value has been found!" : "Value was NOT found!");

    }
}
