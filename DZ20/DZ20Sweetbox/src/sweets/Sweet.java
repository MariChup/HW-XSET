package sweets;

public abstract class Sweet {
    private String name;
    private double weight;
    private double price;

    public Sweet(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getUniqueParameter();

    @Override
    public String toString() {
        return "Name: " + name + ", Weight: " + weight + ", Price: " + price + ", " + getUniqueParameter();
    }
}
