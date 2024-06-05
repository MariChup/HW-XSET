package sweets;

public class Chocolate extends Sweet {
    private String type;

    public Chocolate(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    @Override
    public String getUniqueParameter() {
        return "Type: " + type;
    }
}

