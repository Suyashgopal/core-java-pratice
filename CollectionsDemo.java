// Collections framework - List, Set, Map, Queue

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class CollectionsDemo {
    public static void main(String[] args) {

        // ArrayList - List interface
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");   // duplicates allowed in list
        System.out.println("List: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("First fruit: " + fruits.get(0));

        // HashSet - no duplicates
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple");   // this wont be added again
        System.out.println("Set (no dup): " + uniqueFruits);

        // HashMap - key value pairs
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Math", 90);
        marks.put("Science", 85);
        marks.put("English", 78);
        System.out.println("Map: " + marks);
        System.out.println("Math marks = " + marks.get("Math"));

        // loop through map
        for (Map.Entry<String, Integer> e : marks.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // Queue using LinkedList - FIFO
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Queue: " + q);
        System.out.println("Removed (first in): " + q.poll());
        System.out.println("Queue after poll: " + q);
    }
}
