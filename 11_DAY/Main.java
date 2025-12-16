
// public Strings & StringBuilder (Interview + DSA Important)
import java.util.Scanner;

// Q1️⃣
class Main {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Word: ");
    String input = sc.nextLine();
    String reverse = "";

    String[] words = input.trim().split("\\s+");
    System.out.println("Total words: " + words.length);

    int vowelCount = 0;
    for (int i = input.length() - 1; i >= 0; i--) {
      reverse += input.charAt(i);

      char ch = Character.toLowerCase(input.charAt(i));
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowelCount++;
      }
    }
    System.out.println("Vowels Count" + vowelCount);

    System.out.println("Reversed word: " + reverse);

    // Palindrome check karo (madam → palindrome)
    // if (input.equalsIgnoreCase(reverse)) {
    // System.out.println("✅ The word is a Palindrome");
    // } else {
    // System.out.println("❌ The word is NOT a Palindrome");
    // }

    sc.close();
  }
}

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String input = sc.nextLine();

// String formatted = input.trim();
// String[] parts = formatted.split(" ");

// // Capitalize first letter of both words
// String result = parts[0].substring(0, 1).toUpperCase() +
// parts[0].substring(1).toLowerCase();
// result += " " + parts[1].substring(0, 1).toUpperCase() +
// parts[1].substring(1).toLowerCase();

// System.out.println(result);

// // Print initials
// System.out.println(result.charAt(0) + "." + parts[1].substring(0, 1) + ".");

// sc.close();
// }
// }
