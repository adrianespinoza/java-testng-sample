package aveh.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
    @BeforeMethod(groups = "A", alwaysRun = false)
    public void beforeA()
    {
        System.out.println("before A");
    }



    @Test(groups = "A")
    public void A1()
    {
        System.out.println("test A1");
    }

    @BeforeMethod(groups = "B", alwaysRun = false)
    public void beforeB()
    {
        System.out.println("before B");
    }

    @Test(groups = "B")
    public void B1()
    {
        System.out.println("test B1");
    }
}
