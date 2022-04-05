package hwweek09;
/*Write a Java program to reverse an array of integer values.
* */
public class Program03 {
    public static void main(String[] args) {
        array1();//method calling in main method
    }

    public static void array1() {
        //initialize array
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse array : ");
        //reverse array by for loop
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.print(a[j] + " ");
        }
    }
}
