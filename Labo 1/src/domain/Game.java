package domain;

public class Game extends Product{


    public Game(String productTitles, String productIds) {
        super(productTitles, productIds);
    }

    @Override
    public double getPrice(int days) {
        return days * 3;
    }
}
