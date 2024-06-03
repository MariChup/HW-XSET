package sweets;

public class Candy extends Sweet {
    private String flavor;

    public Candy(String name, double weight, double price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }

    @Override
    public String getUniqueParameter() {
        return "Flavor: " + flavor;
    }
}
