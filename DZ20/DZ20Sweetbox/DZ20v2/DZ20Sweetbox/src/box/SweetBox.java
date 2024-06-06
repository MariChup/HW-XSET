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
    void optimizeByPriceAndPrintWeight(double maxPrice, double maxWeight);
    void optimizeByLowWeight(double maxWeight);
    void optimizeByLowPrice(double maxWeight);
    void optimizeByWeightAndPrintWeight(double maxWeight); // Новый метод
}



