package Assessment1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonFizzBuzzTest {
    static Fizz f;
    static Buzz b;
    @Before
    public void setup() {
        f = new Fizz();
        b = new Buzz();
    }
    @Test
    public void checkNonFizzBuzz() {
        int num = 1;
        String fres = f.checkFizz(num);
        String bres = b.checkBuzz(num);
        String res = fres+bres;
        Assert.assertEquals(0,res.length());
    }
    @After
    public void close() {
        f = null;
        b = null;
    }
}
