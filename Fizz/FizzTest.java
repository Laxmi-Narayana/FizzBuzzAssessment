package Assessment1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzTest {
    static Fizz f;
    @Before
    public void setup() {
        f = new Fizz();
    }
    @Test
    public void checkFizz() {
        int num = 3;
        String res = f.checkFizz(num);
        Assert.assertEquals("Fizz",res);
    }
    @After
    public void close() {
        f = null;
    }
}
