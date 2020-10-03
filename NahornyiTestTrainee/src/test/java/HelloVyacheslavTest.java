import com.nahornyi.toandersen.task2.HelloVyacheslav;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class HelloVyacheslavTest {
    private final static String CRLF = "" + (char) 0x0D + (char) 0x0A;

    private final static String EXPECTED_NAME = "Вячеслав" + CRLF;
    private final static String UNEXPECTED_NAME = "Константин" + CRLF;

    private final static String ANSWER_IF_EQUALS = "Hello! Enter your name please. You will see \"Привет, Вячеслав\" if your name is \"Вячеслав\"." + CRLF +
            "Please enter name: Привет, Вячеслав" + CRLF;
    private final static String ANSWER_IF_NOT_EQUALS = "Hello! Enter your name please. You will see \"Привет, Вячеслав\" if your name is \"Вячеслав\"." + CRLF +
            "Please enter name: Нет такого имени"+ CRLF;

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
    public void helloVyacheslavMethodTest1() {
        helper(EXPECTED_NAME);
        HelloVyacheslav.helloVyacheslavMethod();
        Assert.assertEquals(ANSWER_IF_EQUALS, outContent.toString());
    }

    @Test
    public void helloVyacheslavMethodTest2() {
        helper(UNEXPECTED_NAME);
        HelloVyacheslav.helloVyacheslavMethod();
        Assert.assertEquals(ANSWER_IF_NOT_EQUALS, outContent.toString());
    }


}
