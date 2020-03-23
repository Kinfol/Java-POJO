public class Game {
    String player1;
    String player2;

    public String getScore() {
        if (noPlayerNames()) {
            return "Love-all";
        }

        return String.format("%s: Love, %s Love", player1, player2);
    }

    private boolean noPlayerNames() {
        return player1 == null && player2 == null;
    }

}
