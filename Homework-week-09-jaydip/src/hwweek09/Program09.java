package hwweek09;

import java.util.HashMap;
import java.util.Map;

/*
 * Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
 * */
public class Program09 {
    public static void main(String[] args) {
//Map creation
        HashMap<String, Integer> people = new HashMap();
        people.put("Jay", 1);
        people.put("Chirag", 2);
        people.put("Akshay", 3);
//for each to iterate the value from Map
        for (Map.Entry<String, Integer> xyZ : people.entrySet()) {
            System.out.println(xyZ);

        }
    }

}
