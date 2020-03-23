public class Game {
    String player1;
    String player2;

    public Game() {}

    public Game(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        if (player1 == null && player2 == null) {
            return "Love all";
        }

        return String.format("%s: Love, %s: Love", player1, player2);
    }
}
