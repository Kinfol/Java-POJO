public class Game {
    private static String[] initialScore = {"Love-all"};

    public String getScore() {
        int i;
        for (i = 0; i < initialScore.length; i++) {
            return initialScore[i];
        }
        return null;
    }
}
