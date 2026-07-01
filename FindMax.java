import java.util.Scanner;

public class FindMax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        // Create an array of that size
        int[] nums = new int[size];

        // Prompt user to enter each element
        System.out.println("\nEnter each array element:");
        for (int i = 0; i < nums.length; i++){
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        // Call FindMaximum to get max and index
        int[] result = FindMaximum(nums);
        int maxValue = result[0];
        int maxIndex = result[1];

        // Display the results
        System.out.println("\n========== RESULTS ===========");
        System.out.println("Maximum Value: " + maxValue);
        System.out.println("Index Position: " + maxIndex);
        System.out.println("========================");

        sc.close();

    }

    public static int[] FindMaximum(int[] arr){
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        return new int[] {max, maxIndex};
    }
}