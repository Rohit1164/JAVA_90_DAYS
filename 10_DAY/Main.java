// public class Main {
//   public static void main(String[] args) {
//     int[] arr = { 4, 2, 9, 1, 5 };

//     // Bubble Sort
//     for (int i = 0; i < arr.length - 1; i++) {
//       for (int j = 0; j < arr.length - 1 - i; j++) {
//         if (arr[j] > arr[j + 1]) {
//           int temp = arr[j];
//           arr[j] = arr[j + 1];
//           arr[j + 1] = temp;
//         }
//       }
//     }

//     // Print Sorted Result
//     System.out.print("Sorted Array: ");
//     for (int num : arr) {
//       System.out.print(num + " ");
//     }
//   }
// }

import java.util.Scanner;

// // Linear search
// public class Main {
//   public static void main(String[] args) {
//     int[] arr = { 10, 20, 30, 40, 50 };
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter number to search: ");
//     int target = sc.nextInt();
//     boolean found = false;

//     // Linear Search
//     for (int i = 0; i < arr.length; i++) {
//       if (arr[i] == target) {
//         System.out.println("✅ Number found at index: " + i);
//         found = true;
//         break;
//       }
//     }

//     if (!found) {

//       System.out.println("❌ Number not found!");
//     }
//     sc.close();
//   }
// }

// 3*3 Matrix

public class Main {
  public static void main(String[] args) {
    int[][] matrix = new int[3][3];
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 3x3 matrix values:");

    // Take input
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    // Calculate diagonal sum
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += matrix[i][i]; // main diagonal elements
    }

    System.out.println("🔷 Diagonal Sum: " + sum);
    sc.close();
  }
}
