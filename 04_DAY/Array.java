// import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    System.out.println("Array");
    int[] arr = { 1, 2, 3, 4, 5, 6, 4 };
    // ===============================Easy===========================
    // int largest = arr[0];
    // int sum = 0;
    // ===========================Array print करो
    // for (int k : arr) {
    // System.out.print(" " + k);
    // }
    // =========================== Array का sum निकालो
    // for (int k : arr) {
    // sum += k;
    // System.out.print(" " + sum);
    // }
    // ========================================== Max number
    // ========================================== Min number
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > largest) {
    // largest = arr[i];
    // }
    // }
    // System.out.println("Smallest number : " + largest);
    // =======================================Count even numbers
    // for (int i = 0; i < arr.length; i++) {
    // if (i / 2 == 0) {
    // System.out.println("Even");
    // } else {
    // System.out.println("Odd");
    // }
    // }

    // ===============================Medium===========================
    // Reverse array
    // int temp = 0;
    // while (temp < end) {
    // int start = arr[temp];
    // arr[temp] = arr[end];
    // arr[end] = start;
    // temp++;
    // end--;
    // }
    // int end = arr.length - 1;
    // for (int i = end; i >= 0; i--) {
    // System.out.print(arr[i] + " ");
    // }

    // Search element
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 5) {
    // System.out.println(i);
    // }
    // }

    // Second largest number

    // Remove duplicates
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr.length; j++) {

    // if (arr[i] == arr[i]) {
    // System.out.print(arr[i] + " ");
    // continue;
    // }
    // }
    // }

    int[] temp = new int[arr.length];
    int j = 0;

    for (int i = 0; i < arr.length; i++) {
      boolean duplicate = false;

      for (int k = 0; k < j; k++) {
        if (arr[i] == temp[k]) {
          duplicate = true;
          break;
        }
      }

      if (!duplicate) {
        temp[j] = arr[i];
        j++;
      }
    }

    // Print unique elements
    for (int i = 0; i < j; i++) {
      System.out.print(temp[i] + " ");
    }

    // Count occurrences of an element

    // ===============================Hard===========================
    // Bubble sort
    // Array sorted है या नहीं check करो
    // Merge two arrays
    // Copy array without using built-in method
    // Print unique elements
  }
}