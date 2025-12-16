public class Test {
  public static void main(String[] a) {
    int[] numerators = { 10, 200, 30, 40 };
    int[] denominators = { 1, 2, 0, 4 };
    for (int i = 0; i < numerators.length; i++) {
      System.out.println(divide(numerators[i], denominators[i]));
    }
    System.out.println("Good Bye");
  }

  public static int divide(int a, int b) {
    return a / b;
  }

}