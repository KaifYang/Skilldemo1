import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Skilldemo1Test {
    @Test
    public void Testmultiply() {
        assertEquals(10, Skilldemo1.multiply(2, 5));
    }
}
