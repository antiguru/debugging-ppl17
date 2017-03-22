import java.util.Arrays;

/**
 * Created by moritz on 3/22/17.
 */
public class Strings {

    public static void main(String[] args) {
        String data = "Line 1\nLine 2\nLine 3\nLine 4";

        String[] strings = data.split("\n");
        System.out.println(Arrays.toString(strings));

        for (int i = 0; i < 3; i++) {
            System.out.println(strings[i]);
        }
    }
}
