// Task 4: Bounded Type
// Class:
// class NumberOperations<T extends Number>
// Method:
// square of number
// print result
class NumberOperations<T extends Number> {
  void squareofnumber(T number) {
    double square = number.doubleValue() * number.doubleValue();
    System.out.println("Square of " + number + " is: " + square);
  }

  public static void main(String[] args) {
    NumberOperations<Integer> intOp = new NumberOperations<>();
    intOp.squareofnumber(5);

    NumberOperations<Double> doubleOp = new NumberOperations<>();
    doubleOp.squareofnumber(7.5);

    NumberOperations<Float> floatOp = new NumberOperations<>();
    floatOp.squareofnumber(4.2f);
  }
}