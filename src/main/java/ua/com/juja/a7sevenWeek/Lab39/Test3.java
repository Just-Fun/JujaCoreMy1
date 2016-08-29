package ua.com.juja.a7sevenWeek.Lab39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by serzh on 1/18/16.
 */
public class Test3 {

    public static void main(String[] args)  {
        //prepare
        final List<String> actualHistoryCall = new ArrayList<String>();
        final List<String> expectedExceptionTextAndOrder = new ArrayList<String>();
        expectedExceptionTextAndOrder.add("Error factoryA.createA");
        List<String> expectedHistoryCall = Arrays.asList("factoryA.createA");


        final AutoCloseable resourceA = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                actualHistoryCall.add("A.close");
            }
        };

        final AutoCloseable resourceB = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                actualHistoryCall.add("B.close");
            }
        };

        AutoCloseableFactory factoryA = new AutoCloseableFactory() {
            @Override
            public AutoCloseable create() throws Throwable {
                actualHistoryCall.add("factoryA.createA");
                throw new Error(expectedExceptionTextAndOrder.get(0));
            }


        };

        AutoCloseableFactory factoryB = new AutoCloseableFactory() {
            @Override
            public AutoCloseable create() {
                actualHistoryCall.add("factoryB.createB");
                return resourceB;
            }


        };

        TryBody tryBody = new TryBody() {
            @Override
            public void runBody() {
                actualHistoryCall.add("TryBody.runBody");
                //NOP
            }
        };

        //call and  check
        try {
            TryWithResource.twoResource(factoryA, factoryB, tryBody);
        } catch (Throwable e) {

            if (!expectedExceptionTextAndOrder.get(0).equals(e.getMessage()))
                throw new AssertionError("Not correct main exception");

            if (e.getSuppressed().length != 0)
                throw new AssertionError("Should not be suppressed exceptions  " + e.getSuppressed().length);
        }


        if (!actualHistoryCall.equals(expectedHistoryCall))
            throw new AssertionError("Not correct order call should be " + expectedHistoryCall.toString() + " but found " + actualHistoryCall.toString());

        System.out.print("OK");
    }
}
