package BehavioralPatterns.Command;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
        System.out.println("Додано товар: " + item);
    }

    public void removeItem(String item) {
        items.remove(item);
        System.out.println("Видалено товар: " + item);
    }

    public void placeOrder() {
        System.out.print("Замовлення оформлено. Список товарів: ");
        for(String item : items) {
            System.out.print(item + " ");
        }
    }
}
