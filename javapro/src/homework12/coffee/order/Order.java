package homework12.coffee.order;

public class Order {

  private int number;

  private final String name;

  public Order(String name) {
    this.name = name;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }
}
