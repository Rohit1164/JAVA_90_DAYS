// Task 3: Generic Interface
// Create interface:
// interface Storage<T>
// Class FileStorage implements it.
public interface Data<T> {
  T getValue();

  void setValue(T value);

  public static void main(String[] args) {
    Data<String> stringData = new Data<String>() {
      private String value;

      @Override
      public String getValue() {
        return value;
      }

      @Override
      public void setValue(String value) {
        this.value = value;
      }
    };

    stringData.setValue("Hello Data Interface");
    System.out.println("String Value: " + stringData.getValue());

    Data<Integer> integerData = new Data<Integer>() {
      private Integer value;

      @Override
      public Integer getValue() {
        return value;
      }

      @Override
      public void setValue(Integer value) {
        this.value = value;
      }
    };

    integerData.setValue(100);
    System.out.println("Integer Value: " + integerData.getValue());
  }
}
