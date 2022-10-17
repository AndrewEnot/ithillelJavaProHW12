package homework12.coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {

  private int orderNumber;
  private final List<Order> orders;

  public CoffeeOrderBoard() {
    this.orders = new ArrayList<>();
  }

  //method adds new order to the list of orders
  public void add(Order order) {
    if (order != null) {
      order.setNumber(++orderNumber);
      orders.add(order);
    }
  }

  //method deletes last added order
  public void deliver() {
    orders.remove(orders.size() - 1);
  }

  //method deletes order by the number
  public void deliver(int number) {
    for (int i = 0; i < orders.size(); i++) {
      if (number == orders.get(i).getNumber()) {
        orders.remove(i);
      }
    }
  }

  //method prints to console list of orders in order of making
  public void draw() {
    System.out.println("=".repeat(13));
    System.out.println("Num" + "\t|\t" + "Name");
    for (Order order : orders) {
      System.out.println("\t" + order.getNumber() + "\t|\t" + order.getName());
    }
  }
}


