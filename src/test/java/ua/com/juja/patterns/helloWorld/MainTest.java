package ua.com.juja.patterns.helloWorld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by serzh on 2/4/16.
 */
public class MainTest {

    @Test
    public void test() {
        //given
        ConsoleMock console = new ConsoleMock();

        //when
        Main.main(new String[0]);

        //then
        assertEquals("Hello World!\n", console.getOut());

    }
}