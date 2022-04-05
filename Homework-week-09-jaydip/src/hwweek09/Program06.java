package hwweek09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*Write a Java program to retrieve an element (at a specified index) from a given
array list
* */
public class Program06 {
    public static void main(String[] args) {
        List<String> mobile = new ArrayList<>();//creating array list
        mobile.add("apple");//add value to array list
        mobile.add("samsung");
        mobile.add("vivo");
        mobile.add("one-plus");
        mobile.add("nokia");
        int i;
        System.out.println("Array List : "+mobile);//array list printout
        System.out.println("Please enter index number of array list : ");
        Scanner obj = new Scanner(System.in);//scanner object creation
        i = obj.nextInt();
//if - else statement to get specified index value
        if (i < mobile.toArray().length) {

            String element = mobile.get(i);//Retrive the ith element.
            System.out.println("Selected index value : " + element);
        } else System.out.println("Please enter correct value of index of array list");
    obj.close();
    }
}