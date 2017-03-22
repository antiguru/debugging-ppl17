import java.util.HashMap;

/**
 * Created by moritz on 3/22/17.
 */
public class Hash {

    static class Data {
        String name;
        int value;
    }

    public static void main(String[] args) {
        HashMap<String, Data> d = new HashMap<>();

        Data data = new Data();
        data.name = "a";
        data.value = 123;

        d.put(data.name, data);

        data.name = "b";
        data.value = 456;

        d.put(data.name, data);

        Data data2 = d.get("a");
        System.out.println(data2.name);

    }
}
