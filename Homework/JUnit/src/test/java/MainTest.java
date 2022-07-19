import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void calculate()
    {
        Main m_calc = new Main();
        Assert.assertEquals(1090, m_calc.calculator("10 cm + 1 m - 10 mm"));
    }

}