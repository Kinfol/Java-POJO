public class GameLogic {
    private final static String[] gameScoreChoice = {"Love", "15", "30", "40", "Deuce", "Advantage", "Game", "Set"};

    String player1 = gameScoreChoice[0];
    String player2 = gameScoreChoice[1];

//    int playerA = 0;
//    int playerB = 0;

    public void printPlayerScore(int playerA, int playerB){
        System.out.println(gameScoreChoice[playerA]);
        System.out.println(gameScoreChoice[playerB]);
    }

//    public void printResult(){
//        System.out.println(player1 + " " + player2);
//    }
}
