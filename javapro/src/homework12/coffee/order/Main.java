package homework12.coffee.order;

public class Main {

  public static void main(String[] args) {

    CoffeeOrderBoard newBoard = new CoffeeOrderBoard();

    newBoard.add(new Order("John"));
    newBoard.add(new Order("Mary"));
    newBoard.add(new Order("Alex"));
    newBoard.add(new Order("Peter"));
    newBoard.add(new Order("Andrew"));
    newBoard.add(new Order("Sara"));

    newBoard.deliver();
    newBoard.deliver(2);

    newBoard.draw();
  }
}
