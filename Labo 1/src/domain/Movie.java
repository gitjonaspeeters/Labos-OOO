package domain;

public class Movie extends Product{


    public Movie(String productTitles, String productIds) {
        super(productTitles, productIds);
    }

    @Override
    public double getPrice(int days) {
        double price = 0;
        price = 5;
        int daysLeft = days - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }



        return price;
    }

}
