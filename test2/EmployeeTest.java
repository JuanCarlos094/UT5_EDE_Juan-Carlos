import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

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


}
