import org.apache.log4j.Priority;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailureTest {
    @Test(priority=1)
    public void test1(){
        System.out.println("test1");
    }
    @Test(priority=2)
    public void test2()
    {
        System.out.println("test2");
        int x=1;
        int y=2;
        Assert.assertEquals(x,y);
    }
    @Test(priority=3)
    public void test3()
    {
        System.out.println("test3");
    }
}
