public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Shop shop = new Shop();

        shop.setBottles(productFactory.getDrinksBottles());

        shop.getDrinksBottles();
    }
}