package hwweek09;
/*
* Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)*/

import java.util.HashSet;
import java.util.Set;

public class Program08 {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet();// // Create a HashSet object called num
        num.add(4);//adding values to set
        num.add(7);
        num.add(8);
//set range for numbers between 1 to 10 in set
        for (int i = 1; i <= 10; i++) {
            if (num.contains(i)) {
                System.out.println(i + " is found in set");
            } else {
                System.out.println(i + " is not found in set");
            }
        }
    }
}
