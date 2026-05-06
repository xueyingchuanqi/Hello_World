import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void testHello() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.hello());
    }
}
