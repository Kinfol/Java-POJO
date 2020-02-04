public abstract class DrinksBottle extends Product {

    // Constant
    private static int _totalAllowedInventory = 500;

    // Value to
    private static int _totalStock = 0;

    //
    private int _productBottleCount = 0;

    public DrinksBottle(String productName, double price) {
        super(productName, price);
    }

    public void addBottleToStock(int numberOfItems) {
        if ((_totalStock + numberOfItems) > _totalAllowedInventory) {
            throw new Exception("Too many items in stock");
        }

        _productBottleCount += numberOfItems;
        _totalStock += numberOfItems;
    }

    public void sellBottle() {
        if (_productBottleCount == 0) {
            throw new Exception("No bottles in stock");
        }

        _totalStock -= 1;
        _productBottleCount -= 1;
    }

    // Returns the number of bottles of this type
    public int getNumberOfBottles() {
        return this._productBottleCount;
    }
}