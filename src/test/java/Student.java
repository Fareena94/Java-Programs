import org.testng.annotations.DataProvider;

public class Student {
    @DataProvider(name="details")
    public Object[][] details(){
    return new Object[][]{
            {15,"Fareena", "MPL"},
            {1,"Maanya","MPL"},
            {2,"Chahit","Bnglr"}};
}
}
