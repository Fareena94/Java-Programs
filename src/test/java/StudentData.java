import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentData {
    @Test(dataProvider = "details", dataProviderClass = Student.class)
    public void studentData(Object name,  Object age, Object location ){
        System.out.println(name + " "+location+" "+ age);

    }
}
