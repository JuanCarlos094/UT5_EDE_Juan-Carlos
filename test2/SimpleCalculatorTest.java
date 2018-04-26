import com.JUnit.intellij.test.SimpleCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    private SimpleCalculator calculator;

    @Before
    public void setUp() {
        this.calculator = new SimpleCalculator();
    }
    @Test
    public void testAnotTest(){
        Integer resultado = 2+2;
        Assert.assertNotNull(resultado);
    }
    @Test(timeout=100) public void testTimeOut (){
        Integer i = 0;
        while(1000000000> i){ i ++;
        } System.out.println("Termino");
    }
    @Test(expected = Exception.class)
    public void testExcepcion(){
        Integer.parseInt("b");
    }

    @Test
    public void testAdd() {
        float n1 = 1;
        float n2 = 2;
        float expected = 3;
        float actual;
        actual = this.calculator.add(n1, n2);
        assertEquals(expected, actual, 0.000);
    }
}
