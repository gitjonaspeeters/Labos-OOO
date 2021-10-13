package domain;

import java.util.ArrayList;

public abstract class Product{
    private String productTitles;
    private String  productIds;

    public Product(String productTitles, String productIds) {
        this.productTitles = productTitles;
        this.productIds = productIds;
    }

    public String getProductTitles() {
        return productTitles;
    }

    public void setProductTitles(String productTitles) {
        this.productTitles = productTitles;
    }

    public String getProductIds() {
        return productIds;
    }

    public void setProductIds(String productIds) {
        this.productIds = productIds;
    }
    public abstract double getPrice(int days);
    
}
