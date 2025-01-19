import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class simpej {
 //   public static void main(String[] args) {
//        // Declare and initialize a 2D array
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        // Print the 2D array
//        System.out.println("2D Array:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println(); // New line after each row
//        }
//        matrix[0][0] = 10; // Change the first element (1) to 10
//        System.out.println("Modified 2D Array:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
 public static void main(String[] args) {


     ExtentSparkReporter spark = new ExtentSparkReporter("reports.html");
     ExtentReports extents = new ExtentReports();
     extents.attachReporter(spark);
     ExtentTest test = extents.createTest("My First report","Sample");
     test.pass("Test passed");
     test.fail("Test Failed");
    }
}


