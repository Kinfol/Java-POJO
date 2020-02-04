public class RealAle extends DrinksBottle {

    public RealAle(String productName, double price) {
        super(productName, price);
    }

    public void setPrice(double price) {
        if (price < 3.0 || price > 4.0) {
            throw new Exception("Real Ale has to be between £3.00 and £4.00");
        }
        super.setPrice(price);
    }
}