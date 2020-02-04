public abstract class Product {
    private String _productName;
    private double _price;

    Product(String productName, double price) {
        this._productName = productName;
        this._price = price;
    }

    public String getProductName() {
        return this._productName;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public double getPrice() {
        return this._price;
    }
}