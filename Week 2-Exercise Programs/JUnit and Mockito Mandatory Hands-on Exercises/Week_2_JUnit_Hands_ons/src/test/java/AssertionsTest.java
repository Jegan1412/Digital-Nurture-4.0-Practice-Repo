import org.example.Main;
import org.junit.*;

import static org.junit.Assert.*;

public class AssertionsTest {

    int expected, actual;

    @Before
    public void before(){
        System.out.println("This is before phase\nThe values are Arranged and Acted");

        Main m = new Main();
        int a=5,b=10;
        expected=15;
        actual = m.addition(a,b);
    }

    @Test
    public void testAssertions() {

        // Assert equals
        assertEquals(expected, actual);
        // Assert true
        assertTrue(expected >= actual);
        // Assert false
        assertFalse(expected < actual);
        // Assert null
        assertNull(null);
        // Assert not null
        assertNotNull(new Object());
    }

    @After
    public void after(){
        System.out.println("\nThis is after phase");
        System.out.println("Assert Equals: " + (expected==actual) +
                "\nAssert True: " + (expected>=actual) +
                "\nAssert False: " + (expected<actual));

    }
}
