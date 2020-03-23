import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameLogicTest {

    @Test
    void setScore() {
        GameLogic gameLogic = new GameLogic("Fred", "Bob");
        assertEquals("Fred: Love, Bob: Love", gameLogic.setScore());
    }
}
