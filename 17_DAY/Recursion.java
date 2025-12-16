public class Recursion {
  static int fact(int n) {
    if (n == 1)
      return 1;
    return n * fact(n - 1);
  }

  static int sumOfnNumbers(int n) {
    if (n == 0)
      return 0;
    return n + sumOfnNumbers(n - 1);
  }

  // Q1.Recursively print numbers from 10 to 1.
  static int printNumber(int n) {
    if (n == 0)
      return 0; // Base case
    System.out.println(n);
    return printNumber(n - 1);
  }

  // Q2.Recursively calculate power: 2^5 = 32
  static double mathpower(double n, double pow) {
    if (pow == 0) // Base case
      return 1;

    return n * mathpower(n, pow - 1); // Recursive relation
  }

  // Q3.Recursively find maximum element in array.
  static int maxArray(int[] arr, int index) {
    if (index == arr.length - 1) {
      return arr[index];
    }
    int maxValue = maxArray(arr, index + 1);
    return Math.max(arr[index], maxValue);
  }

  // Q4.Check if string is palindrome using recursion.

  // Q5.Recursively count vowels in string.

  public static void main(String[] args) {
    // int result = fact(5);
    // int result2 = sumOfnNumbers(5);
    // int result3 = printNumber(10);
    // int result4 = (int) mathpower(2, 5);
    int arr[] = { 1, 5, 8, 6, 2 };
    // System.out.println(result);
    // System.out.println(result2);
    // System.out.println(result3);
    // System.out.println(result4);
    System.out.println(maxArray(arr, 0));
  }
}
