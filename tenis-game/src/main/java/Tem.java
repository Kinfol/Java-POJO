//public class Tem {
//
//    private final static String[] gameScoreChoice = {"Love-all", "15-all", "30-all", "40", "Deuce", "Advantage", "Game", "Set"};
//    private String playerA;
//    private String playerB;
//
//    public Game(String playerA, String playerB) {
//        this.playerA = playerA;
//        this.playerB = playerB;
//    }
//
//    public String setLoveAll() {
//        if (playerA.equalsIgnoreCase("Fred")) {
//            playerA = gameScoreChoice[0];
//        }
//        if (playerB.equalsIgnoreCase("Bob")) {
//            playerB = gameScoreChoice[0];
//        }
//        return "Fred: " + playerA + ", " + "Bob: " + playerB;
//    }
//
//    public String set15All() {
//        if (playerA.equalsIgnoreCase("Fred")) {
//            playerA = gameScoreChoice[1];
//        }
//        if (playerB.equalsIgnoreCase("Bob")) {
//            playerB = gameScoreChoice[1];
//        }
//        return "Fred: " + playerA + ", " + "Bob: " + playerB;
//    }
//}
//Game gameLogic = new Game("Fred", "Bob");
//        assertEquals("Fred: Love, Bob: Love", gameLogic.setLoveAll());
