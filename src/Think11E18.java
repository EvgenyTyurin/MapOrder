import java.util.*;

/*
    Bruce Eckel "Think in Java": Chapter 11 Exercise 18.
    Demonstration that, HashMap sorted by hash and
    LinkedHashMap sorted by insertion order
*/


public class Think11E18 {

    // Run point
    public static void main(String[] args) {
        // Fill map "month name" : "month number"
        HashMap<String, Integer> monthNums = new HashMap<>();
        monthNums.put("January", 1);
        monthNums.put("February", 2);
        monthNums.put("March", 3);
        monthNums.put("April", 4);
        monthNums.put("May", 5);
        monthNums.put("June", 6);
        monthNums.put("July", 7);
        monthNums.put("August", 8);
        monthNums.put("September", 9);
        monthNums.put("October", 10);
        monthNums.put("November", 11);
        monthNums.put("December", 12);
        // Show 'chaos' in HashMap
        System.out.println("HashMap " + monthNums);
        // Sort months by name
        SortedSet<String> monthNames = new TreeSet<>();
        monthNames.addAll(monthNums.keySet());
        // Add months to LinkedHashMap in alphabetical order
        LinkedHashMap<String, Integer> linkedMonths = new LinkedHashMap<>();
        for (String month : monthNames)
            linkedMonths.put(month, monthNums.get(month));
        // Show the order in LinkedHashMap
        System.out.println("LinkedHashMap " + linkedMonths);
    }

}
