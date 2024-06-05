package box;

import sweets.Sweet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import sweets.Sweet;

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
        Collections.sort(sweets, Comparator.comparingDouble(Sweet::getWeight));
        while (getTotalWeight() > maxWeight && !sweets.isEmpty()) {
            sweets.remove(0);
        }
    }

    @Override
    public void optimizeByPrice(double maxPrice) {
        Collections.sort(sweets, Comparator.comparingDouble(Sweet::getPrice));
        while (getTotalPrice() > maxPrice && !sweets.isEmpty()) {
            sweets.remove(0);
        }
    }

    // Новый метод, оптимизирующий по цене и выводящий вес
    @Override
    public void optimizeByPriceAndPrintWeight(double maxPrice) {
        Collections.sort(sweets, Comparator.comparingDouble(Sweet::getPrice));
        while (getTotalPrice() > maxPrice && !sweets.isEmpty()) {
            sweets.remove(0);
        }
        System.out.println("Total weight after optimization: " + getTotalWeight());
    }
}
