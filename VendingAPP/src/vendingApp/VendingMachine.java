// Vending machine has id, name
// Vending Machine set and return name

package vendingApp;

public class VendingMachine {
  private static int maxId = 0;
  private int id;
  private String name;

  public VendingMachine(String name) {
    maxId++;
    id = maxId;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}