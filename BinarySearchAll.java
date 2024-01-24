import java.util.Scanner;

public class Main {

  // Binary search to find all occurrences of the target in a sorted array.
  public static int[] binarySearchAll(int[] nums, int target) {

    int[] indices = new int[nums.length]; // Array to store indices of occurrences.

    int count = 0; // To keep track of the number of occurrences.

    int left = 0;
    int right = nums.length - 1;

    // Binary search loop.
    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        // Add the index and check for other occurrences on both sides.
        indices[count++] = mid;

        int leftPointer = mid - 1;
        int rightPointer = mid + 1;

        // Check for occurrences to the left of the current index.
        while (leftPointer >= 0 && nums[leftPointer] == target) {
          indices[count++] = leftPointer;
          leftPointer--;
        }

        // Check for occurrences to the right of the current index.
        while (rightPointer < nums.length && nums[rightPointer] == target) {
          indices[count++] = rightPointer;
          rightPointer++;
        }

        break; // Stop searching.
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    // Create a result array with the exact size needed.
    int[] result = new int[count];
    System.arraycopy(indices, 0, result, 0, count);
    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];

    // Populate the array with user input.
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.print("Enter the target value to search for: ");
    int target = scanner.nextInt();

    // Perform binary search to find all occurrences of the target.
    int[] indices = binarySearchAll(arr, target);

    // Print the indices of all occurrences of the target.
    System.out.print("Indices of all occurrences of " + target + ": ");
    for (int index : indices) {
      System.out.print(index + " ");
    }
  }
}
