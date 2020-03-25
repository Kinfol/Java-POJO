public class TennisGame {

    private static final String[] SCORE = {"Love-all", "15-all", "30-all", "40-ll", "Deuce", "Add-on", "Add-out", "Game"};

    static TennisPlayer serverPoints = new TennisPlayer("server");
//    static TennisPlayer receiverPoints = new TennisPlayer("receiver");
//    static TennisPlayer score = new TennisPlayer();


//    TennisPlayer[] serverPoints = new TennisPlayer[SCORE];

    // I guess this would be like a builder class to orchestrate the rules of the game
    public void playerWinsPoint(TennisPlayer player) {

        if (!deuce() && !advantage() && !win()) {
            addPointUpTo30();
        }

        if (deuce() && !advantage() && !win()) {
            advantage();
        }

        if (!deuce() && advantage() && !win()) {
            win();
        }
        System.out.println(player + "won");
    }


    static TennisPlayer serverScore(int scoreChoice) {
        //I can't do this anymore, how do I solve it?
        serverPoints = SCORE[scoreChoice];
    }

    static int receiverScore() {
        //I can't do this anymore, how do I solve it?
        return SCORE[receiverPoints];
    }

    static void addPointUpTo30(TennisPlayer tennisPlayer, int scoreChoice) {
        //conditions to check where the players are situated
        //how do I count ?
    }

    static boolean advantage(TennisPlayer player) {
        //conditions to check for advantage
        //how do I count
    }

    static boolean deuce(TennisPlayer player) {
        //conditions to check for deuce
        //how do I count
    }

    static boolean win(TennisPlayer player) {
        //conditions to check for deuce
        //how do I count
    }

    //I guess thill is broken too
    public String[] getSCORE() {
        return new String[]{String.format("%d - %d", serverScore(), receiverScore())};
    }
}
