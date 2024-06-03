package box;

import sweets.Sweet;

public interface SweetBox {
    void addSweet(Sweet sweet);
    void removeLastSweet();
    void removeSweet(int index);
    double getTotalWeight();
    double getTotalPrice();
    void printAllSweets();
    void optimizeByWeight(double maxWeight);
    void optimizeByPrice(double maxPrice);
}

