package ua.com.juja.patterns.helloWorld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by serzh on 2/4/16.
 */
public class RunnerTest {

    @Test
    public void test() {
        //given
        InMemoryStrategy strategy= new InMemoryStrategy();
        Runner runner = new Runner(strategy);

        //when
        runner.run();

        //then
        assertEquals("[Hello World!]", strategy.getMessages().toString());
    }
}

