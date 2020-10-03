import com.nahornyi.toandersen.task1.Hello7;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Hello7Test {
    private final static String CRLF = "" + (char) 0x0D + (char) 0x0A;
    private final static String ANSWER_IF_MORE = "Hello! Enter an integer please. If your number more than 7 you'll see \"Привет\"." + CRLF +
            "please enter number: Привет" + CRLF;
    private final static String ANSWER_IF_LESS = "Hello! Enter an integer please. If your number more than 7 you'll see \"Привет\"." + CRLF +
            "please enter number: ";
    private final static String ANSWER_BAD = "Hello! Enter an integer please. If your number more than 7 you'll see \"Привет\"." + CRLF +
            "please enter number: bad argument. try again" + CRLF;

    public final String ARG_MORE = "" + 8;
    public final String ARG_LESS = "" + 6;
    public final String ARG_BAD = "g";


    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private static void helper(String arg) {
        final ByteArrayInputStream inContent = new ByteArrayInputStream(arg.getBytes());
        System.setIn(inContent);
    }

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void hello7Test1() {
        helper(ARG_MORE);
        Hello7.hello7();
        Assert.assertEquals(ANSWER_IF_MORE, outContent.toString());
    }

    @Test
    public void hello7Test2() {
        helper(ARG_LESS);
        Hello7.hello7();
        Assert.assertEquals(ANSWER_IF_LESS, outContent.toString());
    }

    @Test
    public void hello7Test3() {
        helper(ARG_BAD);
        Hello7.hello7();
        Assert.assertEquals(ANSWER_BAD, outContent.toString());
    }

}
