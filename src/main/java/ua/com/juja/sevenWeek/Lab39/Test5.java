package ua.com.juja.sevenWeek.Lab39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by serzh on 1/18/16.
 */
public class Test5 {

    public static void main(String[] args) throws Throwable {
        //prepare
        final List<String> actualHistoryCall = new ArrayList<String>();
        final List<String> expectedExceptionTextAndOrder = new ArrayList<String>();
        expectedExceptionTextAndOrder.add("Error closeB");
        expectedExceptionTextAndOrder.add("Error closeA");

        List<String> expectedHistoryCall = Arrays.asList("factoryA.createA", "factoryB.createB", "TryBody.runBody", "B.close", "A.close");

        final AutoCloseable resourceA = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                actualHistoryCall.add("A.close");
                throw new Error(expectedExceptionTextAndOrder.get(1));
            }
        };

        final AutoCloseable resourceB = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                actualHistoryCall.add("B.close");
                throw new Error(expectedExceptionTextAndOrder.get(0));
            }
        };

        AutoCloseableFactory factoryA = new AutoCloseableFactory() {
            @Override
            public AutoCloseable create() throws Throwable {
                actualHistoryCall.add("factoryA.createA");
                return resourceA;

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
                //Nop
            }
        };

        //call and  check
        try {
            TryWithResource.twoResource(factoryA, factoryB, tryBody);
        } catch (Error e) {
            if (!expectedExceptionTextAndOrder.get(0).equals(e.getMessage()))
                throw new AssertionError("Not correct main exception");

            if (e.getSuppressed().length == 0)
                throw new AssertionError("Should to be suppressed exceptions");

            if (!expectedExceptionTextAndOrder.get(1).equals(e.getSuppressed()[0].getMessage()))
                throw new AssertionError("Should to be suppressed exceptions "+ expectedExceptionTextAndOrder.get(1) + " but found " + e.getCause().getSuppressed()[0].getMessage());

        }


        if (!actualHistoryCall.equals(expectedHistoryCall))
            throw new AssertionError("Not correct order call should be " + expectedHistoryCall.toString() + " but found " + actualHistoryCall.toString());

        System.out.print("OK");
    }
}
