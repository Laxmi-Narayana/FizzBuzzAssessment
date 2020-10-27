package Assessment1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuzzTest {
    static Buzz b;
    @Before
    public void setup() {
        b = new Buzz();
    }
    @Test
    public void checkBuzz() {
        int num = 5;
        String res = b.checkBuzz(num);
        Assert.assertEquals("Buzz",res);
    }
    @After
    public void close() {
        b = null;
    }
}
