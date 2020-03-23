import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestGame {

    @Test
    public void testSetInitialScoreLoveAll() {
        Game game = new Game();
        assertEquals("Love-all", game.getScore());
    }
}
