import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GreeterTest {
    @Test
    void greet_returnsHelloWorld() {
        assertEquals("Hello, World!", Greeter.greet());
    }
}