package BehavioralPatterns.Iterator;

import java.util.List;

public class OrderIterator implements Iterator {
    private List<Product> products;
    private int index;

    public OrderIterator(List<Product> products) {
        this.products = products;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < products.size();
    }

    @Override
    public Product next() {
        if (this.hasNext()) {
            Product product = products.get(index);
            index++;
            return product;
        }
        return null;
    }
}
