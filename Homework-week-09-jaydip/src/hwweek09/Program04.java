package hwweek09;
/*Write a Java program to create a new array list,
*add some colours (string) and printout the collection using for each loop.
* */
import java.util.ArrayList;
import java.util.List;

public class Program04 {
    public static void main(String[] args) {
        List<String> colour = new ArrayList<>();//creating Array list
        colour.add("Orange");//assign values in arrays
        colour.add("Green");
        colour.add("White");
        colour.add("Blue");
        colour.add("Black");
        //for each loop
        for (String colourArray : colour) {
            System.out.println(colourArray);
        }
    }

}
