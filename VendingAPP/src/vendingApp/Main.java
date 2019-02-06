package vendingApp;

public class Main {
  private static void runApp() {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine v1 = new VendingMachine("Food");
    VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");

    Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
    Snack s2 = new Snack("Chocolate Bar", 36, 1.0, v1.getId());
    Snack s3 = new Snack("Pretzel", 30, 2.0, v1.getId());
    Snack s4 = new Snack("Soda", 24, 2.5, v2.getId());
    Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

    System.out.println("*** Processing ***");
    // Customer 1 buys 3 of snack 4.
    c1.buySnack(3, s4);
    // Print Customer 1 Cash on hand. 
    System.out.println("Cash on hand for customer 1 $" + c1.getCashOnHand());
    // Print quantity of snack 4.
    System.out.println("Quantity of snack 4 left " + s4.getQuantity());
    // Customer 2 buys 2 of snack 4
    c2.buySnack(2, s4);
    // Print Customer 2 Cash on hand. 
    System.out.println("Cash on hand for customer 2 $" + c2.getCashOnHand());
    // Print quantity of snack 4.
    System.out.println("Quantity of snack 4 left " + s4.getQuantity());
    // Customer 1 finds $10. Print Customer 1 Cash on hand.
    // addCash returns the new total
    System.out.println("Cash on hand for customer 1 $" + c1.addCash(10));
    // Customer 1 buys 1 of snack 2.
    c1.buySnack(1, s2);
    // Print Customer 1 Cash on Hand.
    System.out.println("Cash on hand for customer 1 $" + c1.getCashOnHand());
    // Print quantity of snack 2.
    System.out.println("Quantity of snack 2 left " + s2.getQuantity());
    // Snack 3 gets 12 more. Print quantity of snack 3.
    // addQuantity returns the new total
    System.out.println("Quantity of snack 3 left " +s3.addQuantity(12));
    // Customer 2 buys 3 of snack 3.
    c2.buySnack(3, s3);
    // Print Customer 2 Cash on hand.
    System.out.println("Cash on hand for customer 2 $" + c2.getCashOnHand());
    // Print quantity of snack 3.
    System.out.println("Quantity of snack 3 left " + s3.getQuantity());
  }

  public static void main(String[] args) {
    runApp();
  }
}