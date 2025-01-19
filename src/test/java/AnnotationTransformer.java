import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {
    public void transform(ITestAnnotation args0, Class args1, Constructor args2, Method args3){
        args0.setRetryAnalyzer(MyTest.class);
    }
}
