import com.JUnit.intellij.test.Suma;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SumaTest {

    @Test
    public void SumaPositiva(){
        System.out.println("Sumándo dos números positivos");
        Suma S = new Suma(2, 3);
        assertTrue(S.sumar() == 5);
    }
    @Test
    public void SumaNegativa(){
        System.out.println("Sumando números negativos");
        Suma S = new Suma(-2,-3);
        assertTrue(S.sumar() == -5);
    }
    @Test
    public void SumaPositivoNegativo(){
        System.out.println("Sumando números negativos y positivos");
        Suma S= new Suma(2, -3);
        //assertTrue(S.sumar() == -1);
        assertEquals( -1, S.sumar());
    }

}
