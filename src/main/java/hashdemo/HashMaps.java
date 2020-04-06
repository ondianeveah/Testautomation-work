package hashdemo;

import java.util.HashMap;
//built in java and can go to java docs to find the methods that come with it
import java.util.Iterator;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer, String> artist = new HashMap<>();
        artist.put(1, "RZA");
        artist.put(2, "DejLoaf");
        artist.put(3, "Da baby");
        artist.put(4, "LedZepplin");


        System.out.println(artist.entrySet());
        System.out.println(artist.keySet());
        System.out.println(artist.values());
        System.out.println(artist.get(1));
        // System.out.println(artist.remove(3));

        for (Map.Entry<Integer, String> entry : artist.entrySet()) {
            System.out.println(entry);
        }

        for (String value : artist.values()) {
            System.out.println(value);
        }

        for (Integer key : artist.keySet()) {
            System.out.println(key);
        }

        Iterator<Map.Entry<Integer, String>> iterator = artist.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<Integer> iterator2 = artist.keySet().iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
