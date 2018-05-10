import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class EmployeeTest {
    private Employee expectedEmpObj;

    @Before
    public void SetUp(){
        expectedEmpObj = new Employee(1,"Marina",30000);
    }

    @Test
    public void equals() {
    }

    @Test
    public void getEmpNameWithHighestSalary()  throws Exception{
        Employee.getEmpNameWithHighestSalary();
        Assert.assertEquals("Marina",Employee.getEmpNameWithHighestSalary());
    }

    @Test
    public void getHighestPaidEmployee() {
        assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
    }

    @Ignore
    public void TestIgnore() {assertTrue("Marina"==expectedEmpObj.getName());}


    @Test
    public void getName() {
    }



    @Test
    public void getEmpId() {
    }



    @Test
    public void getSalary() {
    }

    @Test
    public void Key3NotNull() {
        assertNotNull(expectedEmpObj.getPropValue("key3"));
    }
    @Test
    public void Key9Not() {
        assertNull(expectedEmpObj.getPropValue("key9"));
    }
    @Test
    public void isNotSameReferenceTest() {
        assertNotSame(expectedEmpObj.getPropValue("key1"),expectedEmpObj.getPropValue("key2"));
    }
    @Test
    public void isSameReferenceTest() {
        assertSame(expectedEmpObj.getPropValue("key2"),expectedEmpObj.getPropValue("key4"));
    }
}
