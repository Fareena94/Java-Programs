import io.cucumber.java.lt.Ir;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyTest implements IRetryAnalyzer {
    private int retryCount= 0;
    private int maximumRetries =3;

   public boolean retry(ITestResult result){
       if(retryCount<maximumRetries){
           retryCount++;
           return true;
       }
       return false;
    }
}
