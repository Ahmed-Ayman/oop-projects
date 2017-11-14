import java.io.IOException;
import java.util.Formatter;
import java.util.Locale;

/**
 * Created by ahmed-ayman on 5/21/17.
 */
public class main {
    public static void main(String [] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);
        System.out.println(        formatter.format("\"%1$s\"لقد بدات مشاهدة","transformers"));

    }
}
