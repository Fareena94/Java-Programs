import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArithmeticTest {

    @Test(dataProvider = "additionData", dataProviderClass = ArithmeticDataProvider.class)
    public void testAddition(int a, Object b, int expectedSum) {
//        int actualSum = a + b; // Perform the addition
        System.out.println(a+ "" +b+""+expectedSum);
    }
}
