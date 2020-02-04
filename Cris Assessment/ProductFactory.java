import java.util.ArrayList;

public class ProductFactory {
    public ArrayList<DrinksBottle> getDrinksBottles() {
        ArrayList<DrinksBottle> drinksBottles = new ArrayList<>();
        drinksBottles.add(new Lager("Carling", 2.5));
        drinksBottles.add(new RealAle("Gower Gold", 3.5));
        drinksBottles.add(new SoftDrink("Pepsi", 1.5));

        return drinksBottles;
    }

}