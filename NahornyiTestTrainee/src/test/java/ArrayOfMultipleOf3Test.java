import com.nahornyi.toandersen.task3.ArrayOfMultipleOf3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayOfMultipleOf3Test {

    int[] arg = new int[31];
    int[] expected = new int[11];
    int[] actual = new int[11];

    @Before
    public void setup() {
        for (int i = 0; i <= 30; i++) {
            arg[i] = i;
        }
        for (int i = 0; i <= 10; i++) {
            expected[i] = i * 3;
        }
    }

    @Test
    public void filterArray1() {
        actual = ArrayOfMultipleOf3.filterArrayWithCycle(arg);
        Assert.assertEquals(expected.length, actual.length);
        for (int i = 0; i < 11; i++) {
            if (expected[i] != actual[i]) {
                Assert.assertTrue(false);
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void filterArray2() {
        ArrayOfMultipleOf3.filterArrayWithCycle(null);
    }

    @Test
    public void filterArray3() {
        actual = ArrayOfMultipleOf3.filterArrayWithStreamAPI(arg);
        Assert.assertEquals(expected.length, actual.length);
        for (int i = 0; i < 11; i++) {
            if (expected[i] != actual[i]) {
                Assert.assertTrue(false);
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void filterArray4() {
        ArrayOfMultipleOf3.filterArrayWithStreamAPI(null);
    }

}
