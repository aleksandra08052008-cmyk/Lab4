package model;

/**
 * Текст = масив речень
 */
public class Text {

    private Sentence[] sentences;

    public Text(String text) {

        text = text.replaceAll("\\s+", " ");

        String[] split = text.split("\\.");

        sentences = new Sentence[split.length];

        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Sentence s : sentences) {
            sb.append(s.toString()).append(". ");
        }

        return sb.toString().trim();
    }
}
