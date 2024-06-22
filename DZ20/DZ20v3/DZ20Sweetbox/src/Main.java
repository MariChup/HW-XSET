import box.SweetBox;
import box.SweetBoxImpl;
import sweets.Chocolate;
import sweets.Candy;

public class Main {
    public static void main(String[] args) {
        SweetBox sweetBox = new SweetBoxImpl();

        sweetBox.addSweet(new Chocolate("Milk Chocolate", 100, 5, "Milk"));
        sweetBox.addSweet(new Candy("Strawberry Candy", 50, 2, "Strawberry"));
        sweetBox.addSweet(new Chocolate("Dark Chocolate", 120, 6, "Dark"));
        sweetBox.addSweet(new Candy("Mint Candy", 40, 1.5, "Mint"));

        System.out.println("All sweets in the box:");
        sweetBox.printAllSweets();

        System.out.println("Total weight: " + sweetBox.getTotalWeight());
        System.out.println("Total price: " + sweetBox.getTotalPrice());

        // Оптимизация по цене и вывод веса
        sweetBox.optimizeByLowPrice(350); // Устанавливаем вес для проверки
        System.out.println("After optimizing by low price and weight:");
        sweetBox.printAllSweets();

        // Оптимизация по весу и вывод веса
        sweetBox.optimizeByLowWeight(300); // Устанавливаем вес для проверки
        System.out.println("After optimizing by weight:");
        sweetBox.printAllSweets();
    }
}

