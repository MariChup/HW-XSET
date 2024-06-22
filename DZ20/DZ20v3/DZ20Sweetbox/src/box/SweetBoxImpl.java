package box;

import sweets.Sweet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SweetBoxImpl implements SweetBox {
    private List<Sweet> sweets;

    public SweetBoxImpl() {
        sweets = new ArrayList<>();
    }

    @Override
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void removeLastSweet() {
        if (!sweets.isEmpty()) {
            sweets.remove(sweets.size() - 1);
        }
    }

    @Override
    public void removeSweet(int index) {
        if (index >= 0 && index < sweets.size()) {
            sweets.remove(index);
        }
    }

    @Override
    public double getTotalWeight() {
        return sweets.stream().mapToDouble(Sweet::getWeight).sum();
    }

    @Override
    public double getTotalPrice() {
        return sweets.stream().mapToDouble(Sweet::getPrice).sum();
    }

    @Override
    public void printAllSweets() {
        for (Sweet sweet : sweets) {
            System.out.println(sweet);
        }
    }

    @Override
    public void optimizeByWeight(double maxWeight) {
        System.out.println("Optimizing by weight. Target max weight: " + maxWeight);
        Collections.sort(sweets, Comparator.comparingDouble(Sweet::getWeight));
        while (!sweets.isEmpty() && getTotalWeight() > maxWeight) {
            System.out.println("Removing: " + sweets.get(0));
            sweets.remove(0);
        }
        System.out.println("Total weight after optimization: " + getTotalWeight());
    }

    @Override
    public void optimizeByPrice(double maxPrice) {
        System.out.println("Optimizing by price. Target max price: " + maxPrice);
        Collections.sort(sweets, Comparator.comparingDouble(Sweet::getPrice));
        while (!sweets.isEmpty() && getTotalPrice() > maxPrice) {
            System.out.println("Removing: " + sweets.get(0));
            sweets.remove(0);
        }
        System.out.println("Total price after optimization: " + getTotalPrice());
    }

    @Override
    public void optimizeByLowPrice(double maxWeight) {
        System.out.println("Optimizing by low price. Target max weight: " + maxWeight);
        Collections.sort(sweets, Comparator.comparingDouble(Sweet::getPrice));
        while (!sweets.isEmpty() && getTotalWeight() > maxWeight) {
            System.out.println("Removing: " + sweets.get(0));
            sweets.remove(0);
        }
        System.out.println("Total weight after optimization by low price: " + getTotalWeight());
    }

    @Override
    public void optimizeByLowWeight(double maxWeight) {
        System.out.println("Optimizing by low weight. Target max weight: " + maxWeight);
        Collections.sort(sweets, Comparator.comparingDouble(Sweet::getWeight));
        while (!sweets.isEmpty() && getTotalWeight() > maxWeight) {
            System.out.println("Removing: " + sweets.get(0));
            sweets.remove(0);
        }
        System.out.println("Total weight after optimization by low weight: " + getTotalWeight());
    }
}
