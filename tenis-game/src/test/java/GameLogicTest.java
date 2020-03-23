import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestGame {

    @Test
    public void score_starts_at_love_and_includes_the_players_names() {
        Game game = new Game("Bob", "Fred");

        assertEquals("Bob: Love, Fred: Love", game.getScore());
    }
}
