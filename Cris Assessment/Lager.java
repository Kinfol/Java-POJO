public class Lager extends DrinksBottle {
    private int _percentageDiscount;

    public Lager(String productName, double price) {
        super(productName, price);
    }

    public void setDiscount(int discountPercentage) {
        if (discountPercentage > 0 && discountPercentage < 100) {
            this._percentageDiscount = discountPercentage;
        } else {
            throw new Exception("Invalid discount percentage");
        }
    }

    public double getPrice() {
        double basePrice = super.getPrice();
        double price = basePrice;
        if (_percentageDiscount != 0) {
            price = ((100 - _percentageDiscount) / 100) * basePrice;
        }
        return price;
    }
}