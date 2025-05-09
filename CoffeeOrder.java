public class CoffeeOrder {
    // TODO 1: Change the class name to CoffeeOrder

    // TODO 2: Create instance variables:
    // - size (String)
    String size;
    // - type (String)
    String type;
    // - orderID (String, make this one private)
    private String orderID;

    // TODO 3: Add a static int variable called totalOrders
    static int totalOrders = 0;

    // TODO 4: Create a no-arg constructor
    // Set size to "medium" and type to "black"
    // Increment totalOrders
    public CoffeeOrder() {
        this.size = "medium";
        this.type = "black";
        totalOrders++;
    }

    // TODO 5: Create a constructor that takes a size only
    // Set type to "black" by default
    // Increment totalOrders
    public CoffeeOrder(String size) {
        this.size = size;
        this.type = "black";
        totalOrders++;
    }

    // TODO 6: Create a constructor that takes size and type
    // Increment totalOrders
    public CoffeeOrder(String size, String type) {
        this.size = size;
        this.type = type;
        totalOrders++;
    }

    // TODO 7: Create a method describeOrder() that returns
    // something like "Order: medium black"
    public String describeOrder() {
        return "Order: " + this.size + " " + this.type;
    }

    // TODO 8: Add a static method getTotalOrders() to return totalOrders
    public static int getTotalOrders() {
        return totalOrders;
    }
}
