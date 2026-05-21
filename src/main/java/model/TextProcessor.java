import model.Text;

/**
 * Виконавчий клас
 */
public class TextProcessor {

    public static void main(String[] args) {

        String textInput =
                "Java   is   powerful.  Java   is   simple.   ";

        Text text = new Text(textInput);

        System.out.println(text.toString());
    }
}
