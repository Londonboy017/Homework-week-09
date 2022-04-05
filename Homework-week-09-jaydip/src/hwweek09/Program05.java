package hwweek09;
/*Write a Java program to iterate through all elements in an array list using Iterator
* */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program05 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList();//creating Array list
        number.add(10);//assign values in arrays
        number.add(20);
        number.add(13);
        number.add(15);
        System.out.println("Array : " + number);

        //Iterate set using Iteraor interface
        Iterator obj = number.iterator();//create instance of iterator
        System.out.print("Iterating through Iterator : ");
        while (obj.hasNext()) {
            System.out.print(obj.next() + ",");
        }
    }

}
