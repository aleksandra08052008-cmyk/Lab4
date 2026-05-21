import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import model.Text;
import model.Word;

public class TextProcessorTest {

    @Test
    void testTextCreationNotNull() {
        Text text = new Text("Java   is   powerful. Java is simple.");
        assertNotNull(text);
    }

    @Test
    void testTextToStringNotEmpty() {
        Text text = new Text("Hello world.");
        assertFalse(text.toString().isEmpty());
    }

    @Test
    void testWhitespaceNormalization() {
        Text text = new Text("Java     is\t\tcool.");
        String result = text.toString();

        assertFalse(result.contains("  "));
    }

    @Test
    void testSentenceStructureExists() {
        Text text = new Text("One sentence. Second sentence.");
        assertTrue(text.toString().contains("."));
    }

    @Test
    void testWordBreakdownLogic() {
        Word word = new Word("Java");
        assertEquals("Java", word.toString());
    }

    @Test
    void testLetterInsideWord() {
        Word word = new Word("A");
        assertEquals("A", word.toString());
    }
}
