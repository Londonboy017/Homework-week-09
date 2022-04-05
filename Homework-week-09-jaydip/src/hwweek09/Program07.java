package hwweek09;
/*
* Write a Java program to test an array list is empty or not. Define array list with
underground tube names*/

import java.util.ArrayList;

public class Program07 {
    //main method
    public static void main(String[] args) {
        //Array list creation
        ArrayList<String> tube = new ArrayList();
        tube.add("Jubilee line");
        tube.add("Metropolitan line");
        tube.add("Northern line");
        tube.add("Piccadilly line");
        tube.add("Victoria line");
        tube.add("Waterloo & City line");
        tube.add("Bakerloo line");

        System.out.println(tube);//arraylist
        System.out.println();//space line
//to check array list empty or not.
        if (tube.isEmpty()) {
            System.out.println("Arraylist is empty");
        }else
            System.out.println("Arraylist is not empty");
        }
    }

