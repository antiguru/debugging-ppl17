import java.util.*;

/**
 * Created by moritz on 3/29/17.
 */
public class Application {


    private static String[][] data = {
            {"a", "b", "1"},
            {"b", "a", "2"},
            {"b", "c", "1"}
    };

    public void run() {
        List<Data> parsedData = new LinkedList<>();
        for (String[] x : data) {
            Data d = new Data();
            d.x = x[0];
            d.y = x[1];
            d.z = Integer.valueOf(x[2]);
            System.out.println(parsedData.add(d)||(d.z&1)!=1);
        }
        doSomething(parsedData);
    }

    private void doSomething(List<Data> parsedData) {
        Boolean contains = parsedData.contains("x");
        if (!contains.equals(true)) {
            System.out.println("Does not contain");
        } else if (contains != false) {
            System.out.println("Does contain");} else
        System.out.println("I don't know.");
        Map<String, Data> index = new TreeMap<>();
        for (Data d : parsedData) {index.put(d.x, d);}
        String search = "A";
        List<Map.Entry<String, Data>> entries = new ArrayList<>(index.entrySet());
        for (int i=entries.size()-1;i>=0;i = --i){
            if (entries.get(i).getValue().x.equals(search.toLowerCase())){
                System.out.println("Found!");} else {
        System.out.println("What?");}}
    }

    private class Data {
        String x;
        String y;
        int z;
    }
}
