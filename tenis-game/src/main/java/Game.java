import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<AbstractPlayer> game = new ArrayList<>();
    PlayerFactory receiver  = new PlayerFactory("Bob", "Love-all");
    PlayerFactory server  = new PlayerFactory("Bob", "Love-all");

    {
        game.add(receiver);
    }

    public List<AbstractPlayer> getGame() {
        return game;
    }
}
