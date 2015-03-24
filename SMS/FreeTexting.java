import java.util.ArrayList;

public class FreeTexting {

    public static void main(String[] args) {

        ArrayList texts = new ArrayList();

        for (int i = 0; i < 10; ++i) {
            texts.add(new SMS("Mauer", "Eden",
                "Yo was up! #" + ((i % 5) + 1)));
        }

        System.out.println(texts.get(0).equals(texts.get(5)));

        for (Object text1 : texts) {
            for (Object text2 : texts) {
                if (text1.equals(text2)) {

                }
            }
        }

        for (Object text : texts) {
            Mailer.sendText(((SMS) text).from, ((SMS) text).message);
        }
    }
}
