import java.util.ArrayList;
import DrinksBottles;

public class Shop {

    private ArrayList<DrinksBottles> _drinksBottles;

    public void setBottles(ArrayList<DrinksBottles> drinksBottles) {
        _drinksBottles = drinksBottles;
    }

    public ArrayList<DrinksBottles> getDrinksBottles() {
        return _drinksBottles;
    }
}