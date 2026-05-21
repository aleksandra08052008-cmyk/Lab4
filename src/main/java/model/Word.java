package model;

/**
 * Слово складається з масиву літер
 */
public class Word {

    private Letter[] letters;

    public Word(String word) {
        letters = new Letter[word.length()];

        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Letter l : letters) {
            sb.append(l.getValue());
        }

        return sb.toString();
    }
}
