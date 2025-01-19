import org.testng.annotations.DataProvider;

public class ArithmeticDataProvider {

    @DataProvider(name = "additionData")
    public Object[][] additionData() {
        return new Object[][]{
                {1, "sam", 3},
                {5, 7, 12},
                {0, 0, 0},
                {-1, 1, 0},
                {100, 200, 300}
        };
    }
}
