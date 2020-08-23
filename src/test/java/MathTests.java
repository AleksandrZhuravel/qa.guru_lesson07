import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("easy_tests")
public class MathTests {

    @Test
    void positiveTest() {
        int a = 8;
        String b = System.getProperty("b");
        int c = Integer.parseInt(b);
        System.out.println(a / c);
        assertEquals(a / c, 2, "a/c should be 2");
    }

}
