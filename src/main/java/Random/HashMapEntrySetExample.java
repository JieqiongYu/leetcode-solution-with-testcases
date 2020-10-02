package Random;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntrySetExample {
    public static void main(String[] args) {
        // initialize the HashMap object with Integer as key and String as value
        HashMap<Integer, String> mapEmployee = new HashMap<>();

        // populate the employee map
        mapEmployee.put(1287, "Aquilino Pimentel");
        mapEmployee.put(3125, "Travis Davis");
        mapEmployee.put(9972, "Marianne Laste");

        // get the keys
        Set<Map.Entry<Integer, String>> mappingSet = mapEmployee.entrySet();
        System.out.println("Initial value of keys:" + mappingSet);

        // add another key value mapping
        mapEmployee.put(4581, "Kate Visor");

        // print the values which the set contains
        System.out.println("New set of keys: " + mappingSet);

    }
}
