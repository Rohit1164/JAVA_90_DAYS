class main {
  public static void main(String[] args) {

    try {
      int a = 10;
      System.out.println(a);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    } finally {
      System.out.println("Loading");
    }
  }
}