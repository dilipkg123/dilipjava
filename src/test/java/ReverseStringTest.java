import org.example.ReverseString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {

    @Test
    void testReverseString() {
        ReverseString reverseString = new ReverseString();

        assertEquals("olleH", reverseString.reverse("Hello"));
        assertEquals("avaJ", reverseString.reverse("Java"));
        assertEquals("4321", reverseString.reverse("1234"));
        assertEquals("", reverseString.reverse("")); // Edge case: Empty string
        assertEquals("a", reverseString.reverse("a")); // Edge case: Single character
    }
}
