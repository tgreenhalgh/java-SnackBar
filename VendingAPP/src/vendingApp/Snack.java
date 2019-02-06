// Snack can set name, get quantity, add quantity given quantity,
// buy snack given quantity, get total cost given a quantity.

package vendingApp;

public class Snack {
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(String name, int quantity, double cost, int vendingMachineId) {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public int getQuantity() {
    return quantity;
  }

  public int addQuantity(int more) {
    quantity += more;
    return quantity;
  }

  public int buySnack(int amount) {
    quantity -= amount;
    return quantity;
  }

  public double totalCost(int amount) {
    return cost * (double) amount;
  }
}