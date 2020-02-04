import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test() {
        Main main = new Main();
        int result = main.addNumber(3, 2);
        assertEquals(5, result);

    }
}