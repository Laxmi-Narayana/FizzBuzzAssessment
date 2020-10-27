package Assessment1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    static Fizz f;
    static Buzz b;
    @Before
    public void setup() {
        f = new Fizz();
        b = new Buzz();
    }
    @Test
    public void checkfizzbuzz() {
        int num = 15;
        String fizz = f.checkFizz(num);
        String buzz = b.checkBuzz(num);
        String res = fizz+buzz;
        Assert.assertEquals("FizzBuzz",res);
    }
    @After
    public void close() {
        f = null;
        b = null;
    }
}
