import java.util.Scanner;

public class PairSum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Prompt user for array size
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // Create an array of that size
        int[] arr = new int[size];

        // Prompt user to enter each element
        System.out.println("\nEnter each array element:");
        for (int i = 0; i < arr.length; i++){
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Prompt user for target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Search using brute force
        int[] result = PairSumBruteForce(arr, target);

        // Display results
        if (result != null){
            int index1 = result[2];
            int index2 = result[3];
            int val1 = result[0];
            int val2 = result[1];

            System.out.println("\nPair found!");
            System.out.println("Indices: " + index1 + " and " + index2);
            System.out.println("Values: " + val1 + " and " + val2);
            System.out.println("Equation: " + val1 + " + " + val2 + " = " + target);
        }
        else {
            System.out.println("\nNo pair found that sums to " + target + ".");
        }
    }

    public static int[] PairSumBruteForce(int[] arr, int target){
        for(int i = 0; i <= arr.length - 2; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    return new int[] {arr[i], arr[j], i, j};
                }

            }
        }
        return null;

    }
}