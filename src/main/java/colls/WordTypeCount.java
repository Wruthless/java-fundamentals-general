package colls;

import java.util.*;

public class WordTypeCount {

    public static void main(String[] args) {

        // HashMap to store String keys and Integer values
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // tokenize the input
        String[] tokens = input.split(" ");
        for (String token: tokens) {
            String word = token.toLowerCase();

            // if the map contains a word
            if(map.containsKey(word)) {
                int count = map.get(word);  // get current count
                map.put(word, count + 1);   // increment count
            } else {
                // The put method expects a string and an Integer. Passing a
                // normal int that gets boxed into an Integer object and the
                // Integer objects is placed into the map.
                map.put(word, 1);   // add a new word with a count of 1 to map
            }
        }

    }
    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();    // get keys

        TreeSet<String> sortedKeys = new TreeSet<>(keys);   // sort keys

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (String key: sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }

        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }

}
