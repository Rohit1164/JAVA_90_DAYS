// Task 1: Generic Class
// Create a class Container<T>:
// set()
// get()
// Use with String, Integer
class Generic<T> {
  private T value;

  public Generic(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  // Task 2: Generic Method
  // Create method:
  @SuppressWarnings("hiding")
  public <T> void display(T item) {
    // this.value = item;
    System.out.println("Item: " + item);
  }

  // public void printintem(T item) {
  // this.value = item;
  // System.out.println("Item: " + item);
  // }

  public static void main(String[] args) {
    Generic<Integer> intGeneric = new Generic<>(10);
    intGeneric.setValue(50);
    System.out.println("Integer Value: " + intGeneric.getValue());

    Generic<String> stringGeneric = new Generic<>("Hello Generics");
    stringGeneric.setValue("Generics in Java");
    System.out.println("String Value: " + stringGeneric.getValue());

    Generic<Double> doubleGeneric = new Generic<>(10.0);
    intGeneric.display(10); // T = Integer
    stringGeneric.display("Hello"); // T = String
    doubleGeneric.display(5.5);
  }
}