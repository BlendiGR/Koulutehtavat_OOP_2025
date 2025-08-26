import java.util.HashMap;

public class GroceryListManager {
    private HashMap<String, GroceryItem> items = new HashMap<>();

    public void addItem(String item) {
        addItem(item, 0.0, "Uncategorized", 1);
    }

    public void addItem(String item, double cost) {
        addItem(item, cost, "Uncategorized", 1);
    }

    public void addItem(String item, double cost, String category) {
        addItem(item, cost, category, 1);
    }

    public void addItem(String item, double cost, String category, int quantity) {
        if (items.containsKey(item)) {
            System.out.println("Item \"" + item + "\" is already in the list. Skipping...");
        } else {
            if (quantity < 0) {
                System.out.println("Quantity cannot be negative. Setting to 0 for \"" + item + "\".");
                quantity = 0;
            }
            items.put(item, new GroceryItem(item, cost, category, quantity));
        }
    }

    public void removeItem(String item) {
        if (items.containsKey(item)) {
            items.remove(item);
        } else {
            System.out.println("Item \"" + item + "\" not found in the list.");
        }
    }

    public void updateQuantity(String item, int newQuantity) {
        GroceryItem g = items.get(item);
        if (g == null) {
            System.out.println("Item \"" + item + "\" not found. Cannot update quantity.");
            return;
        }
        if (newQuantity < 0) {
            System.out.println("Quantity cannot be negative. Setting to 0 for \"" + item + "\".");
            newQuantity = 0;
        }
        g.quantity = newQuantity;
    }

    public void displayList() {
        if (items.isEmpty()) {
            System.out.println("The grocery list is empty.");
            return;
        }
        int i = 1;
        for (GroceryItem g : items.values()) {
            System.out.println(i++ + ". " + g.name + " - $" + String.format("%.2f", g.price)
                    + " (" + g.category + ", qty: " + g.quantity + ")");
        }
    }

    public void displayByCategory(String category) {
        int count = 0;
        for (GroceryItem g : items.values()) {
            if (g.category.equalsIgnoreCase(category)) {
                System.out.println(g.name + " - $" + String.format("%.2f", g.price) + " (qty: " + g.quantity + ")");
                count++;
            }
        }
        if (count == 0) System.out.println("No items found in category: " + category);
    }

    public void displayAvailableItems() {
        int count = 0;
        for (GroceryItem g : items.values()) {
            if (g.quantity > 0) {
                System.out.println(g.name + " - $" + String.format("%.2f", g.price)
                        + " (" + g.category + ", qty: " + g.quantity + ")");
                count++;
            }
        }
        if (count == 0) System.out.println("No items with positive quantity.");
    }

    public boolean checkItem(String item) {
        return items.containsKey(item);
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (GroceryItem g : items.values()) total += g.price * g.quantity;
        return total;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items with different costs, categories, and quantities
        manager.addItem("Apples", 2.00, "Fruits", 3);   // $6.00
        manager.addItem("Milk", 1.50, "Dairy", 2);      // $3.00
        manager.addItem("Bread", 1.99, "Bakery", 1);    // $1.99
        manager.addItem("Cheese", 3.79, "Dairy", 0);    // $0.00 (not available)
        manager.addItem("Milk", 1.50, "Dairy", 1);      // duplicate test

        System.out.println("Full Grocery List:");
        manager.displayList();
        System.out.println();

        System.out.println("Available Items (qty > 0):");
        manager.displayAvailableItems();
        System.out.println();

        System.out.println("Items in Dairy:");
        manager.displayByCategory("Dairy");
        System.out.println();

        System.out.println("Total cost (with quantities): $" + String.format("%.2f", manager.calculateTotalCost()));
        System.out.println();

        System.out.println("Updating quantities...");
        manager.updateQuantity("Milk", 0);     // now unavailable
        manager.updateQuantity("Apples", 5);   // increase apples
        manager.updateQuantity("Ham", 2);      // not found test
        System.out.println();

        System.out.println("Available Items after updates:");
        manager.displayAvailableItems();
        System.out.println();

        System.out.println("Total cost after updates: $" + String.format("%.2f", manager.calculateTotalCost()));
    }
}

class GroceryItem {
    String name;
    double price;
    String category;
    int quantity;

    GroceryItem(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = Math.max(quantity, 0);
    }
}
