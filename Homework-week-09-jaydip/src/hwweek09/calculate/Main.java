package hwweek09.calculate;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    static char ans;
    //main method
    public static void main(String[] args) {

        do {
            int a;
            int b;
            char symbol;
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter First Number : ");
            a = obj.nextInt();
            System.out.println("Enter Second Number : ");
            b = obj.nextInt();
            System.out.println("Please enter one of symbol +,-,*, /: ");
            symbol = obj.next().charAt(0);

            Calculator obj1 = new Calculator();//object creation for calculator class
            obj1.calculateResult(a,b,symbol);//calling method via object
            System.out.println("Would you like to do more calculation Please enter :  Y or N");
            ans = obj.next().toLowerCase().charAt(0);
            obj.close();//scanner close
        }
        while (ans == 'y');
    }
}