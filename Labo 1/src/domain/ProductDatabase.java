package domain;

import java.util.ArrayList;

public class ProductDatabase {
    private ArrayList<Product> products;

    public ProductDatabase() {
        this.products = new ArrayList<>();
    }
    public void add(Product p){
        products.add(p);
    }
    public Product zoek(String id){
        for (Product p: products ) {
            if (p.getProductIds().equals(id)){
                return p;
            }
        }
        throw new IllegalArgumentException("Er is geen product met deze id");
    }
}
