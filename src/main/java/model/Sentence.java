package model;

/**
 * Речення = масив слів + розділових знаків
 */
public class Sentence {

    private Word[] words;

    public Sentence(String sentence) {

        sentence = sentence.replaceAll("[\\t\\s]+", " ");

        String[] split = sentence.split(" ");

        words = new Word[split.length];

        for (int i = 0; i < split.length; i++) {
            words[i] = new Word(split[i]);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Word w : words) {
            sb.append(w.toString()).append(" ");
        }

        return sb.toString().trim();
    }
}
