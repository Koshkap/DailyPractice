// SuperStore Exercise: Access Modifiers & Object Modeling Focus

// TODO: Define a class called Product with:
// - A protected String field called name
// - A protected double field called price
// - A private final int productId
// - A public static int nextId to help generate unique IDs
// - A constructor that sets name, price, and assigns a unique ID
// - Public getters for all fields
// - Override toString() to return formatted product details
// - Override equals(Object o) to compare name and productId
class Product {
    protected String name;
    protected double price;
    private final int productId;
    public static int nextId = 1;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.productId = nextId++;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getProductId() { return productId; }

    @Override
    public String toString() {
        return String.format("Product[id=%d, name=%s, price=%.2f]", productId, name, price);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) return false;
        Product p = (Product) o;
        return productId == p.productId && name.equals(p.name);
    }
}

// TODO: Define a subclass Electronics that extends Product
// - Add a private String field called brand
// - Add a private boolean field called hasBattery
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include brand and battery status
class Electronics extends Product {
    private String brand;
    private boolean hasBattery;

    public Electronics(String name, double price, String brand, boolean hasBattery) {
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;
    }

    @Override
    public String toString() {
        return String.format("Electronics[%s, brand=%s, battery=%b]", super.toString(), brand, hasBattery);
    }

    public final String warrantyInfo() {
        return "Standard 1-year warranty applies";
    }
}

// TODO: Define a subclass Grocery that extends Product
// - Add a private double field called weight (in kg)
// - Add a private boolean field called isPerishable
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include weight and perishability
class Grocery extends Product {
    private double weight;
    private boolean isPerishable;

    public Grocery(String name, double price, double weight, boolean isPerishable) {
        super(name, price);
        this.weight = weight;
        this.isPerishable = isPerishable;
    }

    @Override
    public String toString() {
        return String.format("Grocery[%s, weight=%.2fkg, perishable=%b]", super.toString(), weight, isPerishable);
    }
}

// TODO: Define a final class Toy that extends Product
// - Add a private int field called minAge
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include minAge
final class Toy extends Product {
    private int minAge;

    public Toy(String name, double price, int minAge) {
        super(name, price);
        this.minAge = minAge;
    }

    @Override
    public String toString() {
        return String.format("Toy[%s, minAge=%d]", super.toString(), minAge);
    }
}

class Coupon {
    private final double discountRate;

    public Coupon(double discountRate) {
        this.discountRate = discountRate;
    }

    public double applyDiscount(Product product) {
        return product.getPrice() * (1 - discountRate);
    }
}

// TODO: Define class SuperStoreTest with a main method
class SuperStoreTest {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics("Laptop", 999.99, "Dell", true),
            new Grocery("Apple", 0.99, 0.2, true),
            new Toy("Lego Set", 49.99, 8)
        };

        for (Product p : products) {
            System.out.println(p);
        }

        Product p1 = new Product("Test", 10.0);
        Product p2 = new Product("Test", 10.0);
        System.out.println("Equal products: " + p1.equals(p2));
    }
}
