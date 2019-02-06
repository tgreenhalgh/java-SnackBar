// Customer has id, name, cash on hand
// Customer can add cash, buy given total cash used in purchase,
// get and set name, get cash on hand.

package vendingApp;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash) {
    maxId++;
    id = maxId;
    this.name = name;
    this.cash = cash;
  }

  public int getId() {
    return id;
  }

  public double addCash(double amount) {
    cash += amount;
    return cash;
  }

  public double buySnack(int amount, Snack item) {
    int itemsLeft = item.buySnack(amount);
    double cost = item.totalCost(amount);
    cash -= cost;
    return cost;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCashOnHand() {
    return cash;
  }

  public void setCashOnHand(double amount) {
    cash = amount;
  }
}