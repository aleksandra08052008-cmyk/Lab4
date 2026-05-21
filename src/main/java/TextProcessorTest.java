import model.Text;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {

    @Test
    void testTextNotNull() {

        Text text = new Text("Java is good. Java is fast.");

        assertNotNull(text.toString());
    }
}
