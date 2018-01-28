package test;

import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



/**
 * Created by Konopatova on 27.01.2018.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DictonaryWithPriorityTest.class,
        DictonaryWithPriorityOnStreamTest.class
})

public class MainTest extends TestCase {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(MainTest.class);
        System.out.println(result.getRunCount());
        System.out.println(result.wasSuccessful());
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
